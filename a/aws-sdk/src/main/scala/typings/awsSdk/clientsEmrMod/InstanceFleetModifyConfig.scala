package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetModifyConfig extends StObject {
  
  /**
    * A unique identifier for the instance fleet.
    */
  var InstanceFleetId: typings.awsSdk.clientsEmrMod.InstanceFleetId
  
  /**
    * The resize specification for the instance fleet.
    */
  var ResizeSpecifications: js.UndefOr[InstanceFleetResizingSpecifications] = js.undefined
  
  /**
    * The target capacity of On-Demand units for the instance fleet. For more information see InstanceFleetConfig$TargetOnDemandCapacity.
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The target capacity of Spot units for the instance fleet. For more information, see InstanceFleetConfig$TargetSpotCapacity.
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
}
object InstanceFleetModifyConfig {
  
  inline def apply(InstanceFleetId: InstanceFleetId): InstanceFleetModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetId = InstanceFleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetModifyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceFleetModifyConfig] (val x: Self) extends AnyVal {
    
    inline def setInstanceFleetId(value: InstanceFleetId): Self = StObject.set(x, "InstanceFleetId", value.asInstanceOf[js.Any])
    
    inline def setResizeSpecifications(value: InstanceFleetResizingSpecifications): Self = StObject.set(x, "ResizeSpecifications", value.asInstanceOf[js.Any])
    
    inline def setResizeSpecificationsUndefined: Self = StObject.set(x, "ResizeSpecifications", js.undefined)
    
    inline def setTargetOnDemandCapacity(value: WholeNumber): Self = StObject.set(x, "TargetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "TargetOnDemandCapacity", js.undefined)
    
    inline def setTargetSpotCapacity(value: WholeNumber): Self = StObject.set(x, "TargetSpotCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetSpotCapacityUndefined: Self = StObject.set(x, "TargetSpotCapacity", js.undefined)
  }
}
