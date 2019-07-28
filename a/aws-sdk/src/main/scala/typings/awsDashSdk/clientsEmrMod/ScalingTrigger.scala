package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingTrigger extends js.Object {
  /**
    * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger parameters, scaling activity begins.
    */
  var CloudWatchAlarmDefinition: typings.awsDashSdk.clientsEmrMod.CloudWatchAlarmDefinition
}

object ScalingTrigger {
  @scala.inline
  def apply(CloudWatchAlarmDefinition: CloudWatchAlarmDefinition): ScalingTrigger = {
    val __obj = js.Dynamic.literal(CloudWatchAlarmDefinition = CloudWatchAlarmDefinition)
  
    __obj.asInstanceOf[ScalingTrigger]
  }
}

