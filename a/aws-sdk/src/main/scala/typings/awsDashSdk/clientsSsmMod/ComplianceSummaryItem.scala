package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceSummaryItem extends js.Object {
  /**
    * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
  /**
    * A list of COMPLIANT items for the specified compliance type.
    */
  var CompliantSummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CompliantSummary] = js.undefined
  /**
    * A list of NON_COMPLIANT items for the specified compliance type.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NonCompliantSummary] = js.undefined
}

object ComplianceSummaryItem {
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName = null,
    CompliantSummary: CompliantSummary = null,
    NonCompliantSummary: NonCompliantSummary = null
  ): ComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType)
    if (CompliantSummary != null) __obj.updateDynamic("CompliantSummary")(CompliantSummary)
    if (NonCompliantSummary != null) __obj.updateDynamic("NonCompliantSummary")(NonCompliantSummary)
    __obj.asInstanceOf[ComplianceSummaryItem]
  }
}

