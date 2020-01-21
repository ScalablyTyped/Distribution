package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The Availability Zone in which the instance is running.
    */
  var AvailabilityZone: XmlStringMaxLen255 = js.native
  /**
    * The last reported health status of the instance. "Healthy" means that the instance is healthy and should remain in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling should terminate and replace it.
    */
  var HealthStatus: XmlStringMaxLen32 = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19 = js.native
  /**
    * The instance type of the EC2 instance.
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The launch configuration associated with the instance.
    */
  var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The launch template for the instance.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * A description of the current lifecycle state. The Quarantined state is not used.
    */
  var LifecycleState: typings.awsSdk.autoscalingMod.LifecycleState = js.native
  /**
    * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var ProtectedFromScaleIn: InstanceProtected = js.native
  /**
    * The number of capacity units contributed by the instance based on its instance type. Valid Range: Minimum value of 1. Maximum value of 999.
    */
  var WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.native
}

object Instance {
  @scala.inline
  def apply(
    AvailabilityZone: XmlStringMaxLen255,
    HealthStatus: XmlStringMaxLen32,
    InstanceId: XmlStringMaxLen19,
    LifecycleState: LifecycleState,
    ProtectedFromScaleIn: InstanceProtected,
    InstanceType: XmlStringMaxLen255 = null,
    LaunchConfigurationName: XmlStringMaxLen255 = null,
    LaunchTemplate: LaunchTemplateSpecification = null,
    WeightedCapacity: XmlStringMaxLen32 = null
  ): Instance = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], HealthStatus = HealthStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], LifecycleState = LifecycleState.asInstanceOf[js.Any], ProtectedFromScaleIn = ProtectedFromScaleIn.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LaunchConfigurationName != null) __obj.updateDynamic("LaunchConfigurationName")(LaunchConfigurationName.asInstanceOf[js.Any])
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    if (WeightedCapacity != null) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

