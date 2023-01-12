package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruckWeight extends StObject {
  
  /**
    * The total weight of the truck.    For example, 3500.  
    */
  var Total: js.UndefOr[TruckWeightTotalDouble] = js.undefined
  
  /**
    * The unit of measurement to use for the truck weight. Default Value: Kilograms 
    */
  var Unit: js.UndefOr[VehicleWeightUnit] = js.undefined
}
object TruckWeight {
  
  inline def apply(): TruckWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruckWeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TruckWeight] (val x: Self) extends AnyVal {
    
    inline def setTotal(value: TruckWeightTotalDouble): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    
    inline def setUnit(value: VehicleWeightUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
