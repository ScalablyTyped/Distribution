package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TuningJobCompletionCriteria extends js.Object {
  /**
    * The objective metric's value.
    */
  var TargetObjectiveMetricValue: typings.awsDashSdk.clientsSagemakerMod.TargetObjectiveMetricValue = js.native
}

object TuningJobCompletionCriteria {
  @scala.inline
  def apply(TargetObjectiveMetricValue: TargetObjectiveMetricValue): TuningJobCompletionCriteria = {
    val __obj = js.Dynamic.literal(TargetObjectiveMetricValue = TargetObjectiveMetricValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TuningJobCompletionCriteria]
  }
}

