package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetConfig extends StObject {
  
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER, CORE, and TASK.
    */
  var InstanceFleetType: typings.awsSdk.clientsEmrMod.InstanceFleetType
  
  /**
    * The instance type configurations that define the Amazon EC2 instances in the instance fleet.
    */
  var InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.undefined
  
  /**
    * The launch specification for the instance fleet.
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined
  
  /**
    * The friendly name of the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The resize specification for the instance fleet.
    */
  var ResizeSpecifications: js.UndefOr[InstanceFleetResizingSpecifications] = js.undefined
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand Instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand Instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand Instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only Spot Instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot Instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot Instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot Instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only On-Demand Instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
}
object InstanceFleetConfig {
  
  inline def apply(InstanceFleetType: InstanceFleetType): InstanceFleetConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetType = InstanceFleetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceFleetConfig] (val x: Self) extends AnyVal {
    
    inline def setInstanceFleetType(value: InstanceFleetType): Self = StObject.set(x, "InstanceFleetType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeConfigs(value: InstanceTypeConfigList): Self = StObject.set(x, "InstanceTypeConfigs", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "InstanceTypeConfigs", js.undefined)
    
    inline def setInstanceTypeConfigsVarargs(value: InstanceTypeConfig*): Self = StObject.set(x, "InstanceTypeConfigs", js.Array(value*))
    
    inline def setLaunchSpecifications(value: InstanceFleetProvisioningSpecifications): Self = StObject.set(x, "LaunchSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLaunchSpecificationsUndefined: Self = StObject.set(x, "LaunchSpecifications", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResizeSpecifications(value: InstanceFleetResizingSpecifications): Self = StObject.set(x, "ResizeSpecifications", value.asInstanceOf[js.Any])
    
    inline def setResizeSpecificationsUndefined: Self = StObject.set(x, "ResizeSpecifications", js.undefined)
    
    inline def setTargetOnDemandCapacity(value: WholeNumber): Self = StObject.set(x, "TargetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "TargetOnDemandCapacity", js.undefined)
    
    inline def setTargetSpotCapacity(value: WholeNumber): Self = StObject.set(x, "TargetSpotCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetSpotCapacityUndefined: Self = StObject.set(x, "TargetSpotCapacity", js.undefined)
  }
}
