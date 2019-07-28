package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetInstanceProtectionQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * One or more instance IDs.
    */
  var InstanceIds: typings.awsDashSdk.clientsAutoscalingMod.InstanceIds
  /**
    * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var ProtectedFromScaleIn: typings.awsDashSdk.clientsAutoscalingMod.ProtectedFromScaleIn
}

object SetInstanceProtectionQuery {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    InstanceIds: InstanceIds,
    ProtectedFromScaleIn: ProtectedFromScaleIn
  ): SetInstanceProtectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, InstanceIds = InstanceIds, ProtectedFromScaleIn = ProtectedFromScaleIn)
  
    __obj.asInstanceOf[SetInstanceProtectionQuery]
  }
}

