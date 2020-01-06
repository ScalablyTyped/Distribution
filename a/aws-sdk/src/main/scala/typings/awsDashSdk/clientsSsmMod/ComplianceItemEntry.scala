package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceItemEntry extends js.Object {
  /**
    * A "Key": "Value" tag combination for the compliance item.
    */
  var Details: js.UndefOr[ComplianceItemDetails] = js.native
  /**
    * The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article.
    */
  var Id: js.UndefOr[ComplianceItemId] = js.native
  /**
    * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
    */
  var Severity: ComplianceSeverity = js.native
  /**
    * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
    */
  var Status: ComplianceStatus = js.native
  /**
    * The title of the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services. 
    */
  var Title: js.UndefOr[ComplianceItemTitle] = js.native
}

object ComplianceItemEntry {
  @scala.inline
  def apply(
    Severity: ComplianceSeverity,
    Status: ComplianceStatus,
    Details: ComplianceItemDetails = null,
    Id: ComplianceItemId = null,
    Title: ComplianceItemTitle = null
  ): ComplianceItemEntry = {
    val __obj = js.Dynamic.literal(Severity = Severity.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceItemEntry]
  }
}

