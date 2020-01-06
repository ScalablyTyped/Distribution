package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceSummaryItem extends js.Object {
  /**
    * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  /**
    * A list of COMPLIANT items for the specified compliance type.
    */
  var CompliantSummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CompliantSummary] = js.native
  /**
    * A list of NON_COMPLIANT items for the specified compliance type.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NonCompliantSummary] = js.native
}

object ComplianceSummaryItem {
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName = null,
    CompliantSummary: CompliantSummary = null,
    NonCompliantSummary: NonCompliantSummary = null
  ): ComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (CompliantSummary != null) __obj.updateDynamic("CompliantSummary")(CompliantSummary.asInstanceOf[js.Any])
    if (NonCompliantSummary != null) __obj.updateDynamic("NonCompliantSummary")(NonCompliantSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceSummaryItem]
  }
}

