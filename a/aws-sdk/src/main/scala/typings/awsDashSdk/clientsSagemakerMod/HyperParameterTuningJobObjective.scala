package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobObjective extends js.Object {
  /**
    * The name of the metric to use for the objective metric.
    */
  var MetricName: typings.awsDashSdk.clientsSagemakerMod.MetricName = js.native
  /**
    * Whether to minimize or maximize the objective metric.
    */
  var Type: HyperParameterTuningJobObjectiveType = js.native
}

object HyperParameterTuningJobObjective {
  @scala.inline
  def apply(MetricName: MetricName, Type: HyperParameterTuningJobObjectiveType): HyperParameterTuningJobObjective = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HyperParameterTuningJobObjective]
  }
}

