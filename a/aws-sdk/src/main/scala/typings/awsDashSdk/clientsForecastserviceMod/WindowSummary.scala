package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSummary extends js.Object {
  /**
    * The type of evaluation.    SUMMARY - The average metrics across all windows.    COMPUTED - The metrics for the specified window.  
    */
  var EvaluationType: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EvaluationType] = js.undefined
  /**
    * The number of data points within the window.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  var Metrics: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Metrics] = js.undefined
  /**
    * The timestamp that defines the end of the window.
    */
  var TestWindowEnd: js.UndefOr[Timestamp] = js.undefined
  /**
    * The timestamp that defines the start of the window.
    */
  var TestWindowStart: js.UndefOr[Timestamp] = js.undefined
}

object WindowSummary {
  @scala.inline
  def apply(
    EvaluationType: EvaluationType = null,
    ItemCount: Int | scala.Double = null,
    Metrics: Metrics = null,
    TestWindowEnd: Timestamp = null,
    TestWindowStart: Timestamp = null
  ): WindowSummary = {
    val __obj = js.Dynamic.literal()
    if (EvaluationType != null) __obj.updateDynamic("EvaluationType")(EvaluationType.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (TestWindowEnd != null) __obj.updateDynamic("TestWindowEnd")(TestWindowEnd)
    if (TestWindowStart != null) __obj.updateDynamic("TestWindowStart")(TestWindowStart)
    __obj.asInstanceOf[WindowSummary]
  }
}

