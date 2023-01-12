package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeLimits extends StObject {
  
  /**
    *  The upper boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration. 
    */
  var MaximumCapacityUnits: Integer
  
  /**
    *  The upper boundary of EC2 units for core node type in a cluster. It is measured through vCPU cores or instances for instance groups and measured through units for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and task nodes. 
    */
  var MaximumCoreCapacityUnits: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The upper boundary of On-Demand EC2 units. It is measured through vCPU cores or instances for instance groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot Instances. 
    */
  var MaximumOnDemandCapacityUnits: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The lower boundary of EC2 units. It is measured through vCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration. 
    */
  var MinimumCapacityUnits: Integer
  
  /**
    *  The unit type used for specifying a managed scaling policy. 
    */
  var UnitType: ComputeLimitsUnitType
}
object ComputeLimits {
  
  inline def apply(MaximumCapacityUnits: Integer, MinimumCapacityUnits: Integer, UnitType: ComputeLimitsUnitType): ComputeLimits = {
    val __obj = js.Dynamic.literal(MaximumCapacityUnits = MaximumCapacityUnits.asInstanceOf[js.Any], MinimumCapacityUnits = MinimumCapacityUnits.asInstanceOf[js.Any], UnitType = UnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputeLimits] (val x: Self) extends AnyVal {
    
    inline def setMaximumCapacityUnits(value: Integer): Self = StObject.set(x, "MaximumCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setMaximumCoreCapacityUnits(value: Integer): Self = StObject.set(x, "MaximumCoreCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setMaximumCoreCapacityUnitsUndefined: Self = StObject.set(x, "MaximumCoreCapacityUnits", js.undefined)
    
    inline def setMaximumOnDemandCapacityUnits(value: Integer): Self = StObject.set(x, "MaximumOnDemandCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setMaximumOnDemandCapacityUnitsUndefined: Self = StObject.set(x, "MaximumOnDemandCapacityUnits", js.undefined)
    
    inline def setMinimumCapacityUnits(value: Integer): Self = StObject.set(x, "MinimumCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setUnitType(value: ComputeLimitsUnitType): Self = StObject.set(x, "UnitType", value.asInstanceOf[js.Any])
  }
}
