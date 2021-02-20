package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends StObject {
  
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
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: XmlStringMaxLen255): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatus(value: XmlStringMaxLen32): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    @scala.inline
    def setLifecycleState(value: LifecycleState): Self = StObject.set(x, "LifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedFromScaleIn(value: InstanceProtected): Self = StObject.set(x, "ProtectedFromScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacity(value: XmlStringMaxLen32): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
