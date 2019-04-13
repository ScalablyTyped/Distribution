package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
  /**
    * The name of the objective metric.
    */
  var MetricName: awsDashSdkLib.clientsSagemakerMod.MetricName
  /**
    * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
    */
  var Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined
  /**
    * The value of the objective metric.
    */
  var Value: MetricValue
}

object FinalHyperParameterTuningJobObjectiveMetric {
  @scala.inline
  def apply(MetricName: MetricName, Value: MetricValue, Type: HyperParameterTuningJobObjectiveType = null): FinalHyperParameterTuningJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName, Value = Value)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
  }
}

