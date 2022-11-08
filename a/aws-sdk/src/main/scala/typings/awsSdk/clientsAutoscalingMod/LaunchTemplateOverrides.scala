package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateOverrides extends StObject {
  
  /**
    * The instance requirements. Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then, it uses your On-Demand and Spot allocation strategies to launch instances from these instance types. You can specify up to four separate sets of instance requirements per Auto Scaling group. This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the same Auto Scaling group. To do this, create the AMIs and create a new launch template for each AMI. Then, create a compatible set of instance requirements for each launch template.   If you specify InstanceRequirements, you can't specify InstanceType. 
    */
  var InstanceRequirements: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstanceRequirements] = js.undefined
  
  /**
    * The instance type, such as m3.xlarge. You must specify an instance type that is supported in your requested Region and Availability Zones. For more information, see Instance types in the Amazon Elastic Compute Cloud User Guide. You can specify up to 40 instance types per Auto Scaling group.
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * Provides a launch template for the specified instance type or set of instance requirements. For example, some instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template that's specified in the LaunchTemplate definition. For more information, see Specifying a different launch template for an instance type in the Amazon EC2 Auto Scaling User Guide.  You can specify up to 20 launch templates per Auto Scaling group. The launch templates specified in the overrides and in the LaunchTemplate definition count towards this limit.
    */
  var LaunchTemplateSpecification: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LaunchTemplateSpecification] = js.undefined
  
  /**
    * If you provide a list of instance types to use, you can specify the number of capacity units provided by each instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is launched, the capacity units count toward the desired capacity. Amazon EC2 Auto Scaling launches instances until the desired capacity is totally fulfilled, even if this results in an overage. For example, if there are two units remaining to fulfill capacity, and Amazon EC2 Auto Scaling can only launch an instance with a WeightedCapacity of five units, the instance is launched, and the desired capacity is exceeded by three units. For more information, see Configuring instance weighting for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide. Value must be in the range of 1–999. If you specify a value for WeightedCapacity for one instance type, you must specify a value for WeightedCapacity for all of them.  Every Auto Scaling group has three size parameters (DesiredCapacity, MaxSize, and MinSize). Usually, you set these sizes based on a specific number of instances. However, if you configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with the same units that you use for weighting instances.  
    */
  var WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.undefined
}
object LaunchTemplateOverrides {
  
  inline def apply(): LaunchTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateOverrides]
  }
  
  extension [Self <: LaunchTemplateOverrides](x: Self) {
    
    inline def setInstanceRequirements(value: InstanceRequirements): Self = StObject.set(x, "InstanceRequirements", value.asInstanceOf[js.Any])
    
    inline def setInstanceRequirementsUndefined: Self = StObject.set(x, "InstanceRequirements", js.undefined)
    
    inline def setInstanceType(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLaunchTemplateSpecification(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    inline def setWeightedCapacity(value: XmlStringMaxLen32): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
