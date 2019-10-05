package typings.awsDashSdk.clientsXrayMod

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
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Timestamp] = js.undefined
}

object SamplingStatisticSummary {
  @scala.inline
  def apply(
    BorrowCount: Int | scala.Double = null,
    RequestCount: Int | scala.Double = null,
    RuleName: String = null,
    SampledCount: Int | scala.Double = null,
    Timestamp: Timestamp = null
  ): SamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    if (BorrowCount != null) __obj.updateDynamic("BorrowCount")(BorrowCount.asInstanceOf[js.Any])
    if (RequestCount != null) __obj.updateDynamic("RequestCount")(RequestCount.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    if (SampledCount != null) __obj.updateDynamic("SampledCount")(SampledCount.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[SamplingStatisticSummary]
  }
}

