package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentMetricSummary extends js.Object {
  /**
    * The average value of the metric.
    */
  var Avg: js.UndefOr[OptionalDouble] = js.native
  /**
    * The number of samples used to generate the metric.
    */
  var Count: js.UndefOr[OptionalInteger] = js.native
  /**
    * The most recent value of the metric.
    */
  var Last: js.UndefOr[OptionalDouble] = js.native
  /**
    * The maximum value of the metric.
    */
  var Max: js.UndefOr[OptionalDouble] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MetricName] = js.native
  /**
    * The minimum value of the metric.
    */
  var Min: js.UndefOr[OptionalDouble] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  /**
    * The standard deviation of the metric.
    */
  var StdDev: js.UndefOr[OptionalDouble] = js.native
  /**
    * When the metric was last updated.
    */
  var TimeStamp: js.UndefOr[Timestamp] = js.native
}

object TrialComponentMetricSummary {
  @scala.inline
  def apply(
    Avg: Int | Double = null,
    Count: Int | Double = null,
    Last: Int | Double = null,
    Max: Int | Double = null,
    MetricName: MetricName = null,
    Min: Int | Double = null,
    SourceArn: TrialComponentSourceArn = null,
    StdDev: Int | Double = null,
    TimeStamp: Timestamp = null
  ): TrialComponentMetricSummary = {
    val __obj = js.Dynamic.literal()
    if (Avg != null) __obj.updateDynamic("Avg")(Avg.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Last != null) __obj.updateDynamic("Last")(Last.asInstanceOf[js.Any])
    if (Max != null) __obj.updateDynamic("Max")(Max.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Min != null) __obj.updateDynamic("Min")(Min.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (StdDev != null) __obj.updateDynamic("StdDev")(StdDev.asInstanceOf[js.Any])
    if (TimeStamp != null) __obj.updateDynamic("TimeStamp")(TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentMetricSummary]
  }
}

