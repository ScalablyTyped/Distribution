package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalAutoMLJobObjectiveMetric extends js.Object {
  /**
    * The name of the metric.
    */
  var MetricName: AutoMLMetricEnum = js.native
  /**
    * The metric type used.
    */
  var Type: js.UndefOr[AutoMLJobObjectiveType] = js.native
  /**
    * The value of the metric.
    */
  var Value: MetricValue = js.native
}

object FinalAutoMLJobObjectiveMetric {
  @scala.inline
  def apply(MetricName: AutoMLMetricEnum, Value: MetricValue, Type: AutoMLJobObjectiveType = null): FinalAutoMLJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalAutoMLJobObjectiveMetric]
  }
}

