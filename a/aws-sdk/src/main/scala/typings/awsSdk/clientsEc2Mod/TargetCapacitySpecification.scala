package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetCapacitySpecification extends StObject {
  
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[typings.awsSdk.clientsEc2Mod.DefaultTargetCapacityType] = js.undefined
  
  /**
    * The number of On-Demand units to request. If you specify a target capacity for Spot units, you cannot specify a target capacity for On-Demand units.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum number of Spot units to launch. If you specify a target capacity for On-Demand units, you cannot specify a target capacity for Spot units.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The unit for the target capacity. Default: units (translates to number of instances)
    */
  var TargetCapacityUnitType: js.UndefOr[typings.awsSdk.clientsEc2Mod.TargetCapacityUnitType] = js.undefined
  
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: js.UndefOr[Integer] = js.undefined
}
object TargetCapacitySpecification {
  
  inline def apply(): TargetCapacitySpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetCapacitySpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetCapacitySpecification] (val x: Self) extends AnyVal {
    
    inline def setDefaultTargetCapacityType(value: DefaultTargetCapacityType): Self = StObject.set(x, "DefaultTargetCapacityType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetCapacityTypeUndefined: Self = StObject.set(x, "DefaultTargetCapacityType", js.undefined)
    
    inline def setOnDemandTargetCapacity(value: Integer): Self = StObject.set(x, "OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "OnDemandTargetCapacity", js.undefined)
    
    inline def setSpotTargetCapacity(value: Integer): Self = StObject.set(x, "SpotTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setSpotTargetCapacityUndefined: Self = StObject.set(x, "SpotTargetCapacity", js.undefined)
    
    inline def setTargetCapacityUnitType(value: TargetCapacityUnitType): Self = StObject.set(x, "TargetCapacityUnitType", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUnitTypeUndefined: Self = StObject.set(x, "TargetCapacityUnitType", js.undefined)
    
    inline def setTotalTargetCapacity(value: Integer): Self = StObject.set(x, "TotalTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTotalTargetCapacityUndefined: Self = StObject.set(x, "TotalTargetCapacity", js.undefined)
  }
}
