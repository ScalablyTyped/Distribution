package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingStatisticSummary extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: js.UndefOr[Integer] = js.undefined
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.undefined
  /**
    * The number of requests recorded.
    */
  var SampledCount: js.UndefOr[Integer] = js.undefined
  /**
    * The start time of the reporting window.
    */
  var Timestamp: js.UndefOr[Timestamp] = js.undefined
}

object SamplingStatisticSummary {
  @scala.inline
  def apply(
    BorrowCount: js.UndefOr[Integer] = js.undefined,
    RequestCount: js.UndefOr[Integer] = js.undefined,
    RuleName: String = null,
    SampledCount: js.UndefOr[Integer] = js.undefined,
    Timestamp: Timestamp = null
  ): SamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BorrowCount)) __obj.updateDynamic("BorrowCount")(BorrowCount)
    if (!js.isUndefined(RequestCount)) __obj.updateDynamic("RequestCount")(RequestCount)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    if (!js.isUndefined(SampledCount)) __obj.updateDynamic("SampledCount")(SampledCount)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[SamplingStatisticSummary]
  }
}

