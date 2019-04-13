package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingInstanceDetails extends js.Object {
  /**
    * The name of the Auto Scaling group for the instance.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: XmlStringMaxLen255
  /**
    * The last reported health status of this instance. "Healthy" means that the instance is healthy and should remain in service. "Unhealthy" means that the instance is unhealthy and Amazon EC2 Auto Scaling should terminate and replace it.
    */
  var HealthStatus: XmlStringMaxLen32
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19
  /**
    * The launch configuration used to launch the instance. This value is not available if you attached the instance to the Auto Scaling group.
    */
  var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The launch template for the instance.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  /**
    * The lifecycle state for the instance.
    */
  var LifecycleState: XmlStringMaxLen32
  /**
    * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var ProtectedFromScaleIn: InstanceProtected
}

object AutoScalingInstanceDetails {
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    AvailabilityZone: XmlStringMaxLen255,
    HealthStatus: XmlStringMaxLen32,
    InstanceId: XmlStringMaxLen19,
    LifecycleState: XmlStringMaxLen32,
    ProtectedFromScaleIn: InstanceProtected,
    LaunchConfigurationName: XmlStringMaxLen255 = null,
    LaunchTemplate: LaunchTemplateSpecification = null
  ): AutoScalingInstanceDetails = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, AvailabilityZone = AvailabilityZone, HealthStatus = HealthStatus, InstanceId = InstanceId, LifecycleState = LifecycleState, ProtectedFromScaleIn = ProtectedFromScaleIn)
    if (LaunchConfigurationName != null) __obj.updateDynamic("LaunchConfigurationName")(LaunchConfigurationName)
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate)
    __obj.asInstanceOf[AutoScalingInstanceDetails]
  }
}

