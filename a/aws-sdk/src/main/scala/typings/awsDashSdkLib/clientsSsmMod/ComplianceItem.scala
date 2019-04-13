package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceItem extends js.Object {
  /**
    * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:string are all valid compliance types.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
  /**
    * A "Key": "Value" tag combination for the compliance item.
    */
  var Details: js.UndefOr[ComplianceItemDetails] = js.undefined
  /**
    * A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined
  /**
    * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.
    */
  var Id: js.UndefOr[ComplianceItemId] = js.undefined
  /**
    * An ID for the resource. For a managed instance, this is the instance ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined
  /**
    * The type of resource. ManagedInstance is currently the only supported resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined
  /**
    * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
    */
  var Severity: js.UndefOr[ComplianceSeverity] = js.undefined
  /**
    * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.undefined
  /**
    * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
    */
  var Title: js.UndefOr[ComplianceItemTitle] = js.undefined
}

object ComplianceItem {
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName = null,
    Details: ComplianceItemDetails = null,
    ExecutionSummary: ComplianceExecutionSummary = null,
    Id: ComplianceItemId = null,
    ResourceId: ComplianceResourceId = null,
    ResourceType: ComplianceResourceType = null,
    Severity: ComplianceSeverity = null,
    Status: ComplianceStatus = null,
    Title: ComplianceItemTitle = null
  ): ComplianceItem = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType)
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (ExecutionSummary != null) __obj.updateDynamic("ExecutionSummary")(ExecutionSummary)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[ComplianceItem]
  }
}

