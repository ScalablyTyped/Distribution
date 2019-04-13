package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeveritySummary extends js.Object {
  /**
    * The total number of resources or compliance items that have a severity level of critical. Critical severity is determined by the organization that published the compliance items.
    */
  var CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  /**
    * The total number of resources or compliance items that have a severity level of high. High severity is determined by the organization that published the compliance items.
    */
  var HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  /**
    * The total number of resources or compliance items that have a severity level of informational. Informational severity is determined by the organization that published the compliance items.
    */
  var InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  /**
    * The total number of resources or compliance items that have a severity level of low. Low severity is determined by the organization that published the compliance items.
    */
  var LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  /**
    * The total number of resources or compliance items that have a severity level of medium. Medium severity is determined by the organization that published the compliance items.
    */
  var MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  /**
    * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity is determined by the organization that published the compliance items.
    */
  var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
}

object SeveritySummary {
  @scala.inline
  def apply(
    CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    HighCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    LowCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    MediumCount: js.UndefOr[ComplianceSummaryCount] = js.undefined,
    UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  ): SeveritySummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CriticalCount)) __obj.updateDynamic("CriticalCount")(CriticalCount)
    if (!js.isUndefined(HighCount)) __obj.updateDynamic("HighCount")(HighCount)
    if (!js.isUndefined(InformationalCount)) __obj.updateDynamic("InformationalCount")(InformationalCount)
    if (!js.isUndefined(LowCount)) __obj.updateDynamic("LowCount")(LowCount)
    if (!js.isUndefined(MediumCount)) __obj.updateDynamic("MediumCount")(MediumCount)
    if (!js.isUndefined(UnspecifiedCount)) __obj.updateDynamic("UnspecifiedCount")(UnspecifiedCount)
    __obj.asInstanceOf[SeveritySummary]
  }
}

