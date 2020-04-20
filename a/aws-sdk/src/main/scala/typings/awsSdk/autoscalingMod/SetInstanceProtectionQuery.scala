package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetInstanceProtectionQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * One or more instance IDs.
    */
  var InstanceIds: typings.awsSdk.autoscalingMod.InstanceIds = js.native
  /**
    * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var ProtectedFromScaleIn: typings.awsSdk.autoscalingMod.ProtectedFromScaleIn = js.native
}

object SetInstanceProtectionQuery {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    InstanceIds: InstanceIds,
    ProtectedFromScaleIn: ProtectedFromScaleIn
  ): SetInstanceProtectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], InstanceIds = InstanceIds.asInstanceOf[js.Any], ProtectedFromScaleIn = ProtectedFromScaleIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstanceProtectionQuery]
  }
}

