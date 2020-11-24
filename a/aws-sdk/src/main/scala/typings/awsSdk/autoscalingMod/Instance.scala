package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    ProtectedFromScaleIn: InstanceProtected
  ): Instance = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], HealthStatus = HealthStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], LifecycleState = LifecycleState.asInstanceOf[js.Any], ProtectedFromScaleIn = ProtectedFromScaleIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZone(value: XmlStringMaxLen255): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatus(value: XmlStringMaxLen32): Self = this.set("HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleState(value: LifecycleState): Self = this.set("LifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedFromScaleIn(value: InstanceProtected): Self = this.set("ProtectedFromScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: XmlStringMaxLen255): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = this.set("LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchConfigurationName: Self = this.set("LaunchConfigurationName", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("LaunchTemplate", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: XmlStringMaxLen32): Self = this.set("WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("WeightedCapacity", js.undefined)
  }
}
