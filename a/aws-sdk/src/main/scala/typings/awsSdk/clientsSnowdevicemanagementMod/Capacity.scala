package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  /**
    * The amount of capacity available for use on the device.
    */
  var available: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the type of capacity, such as memory.
    */
  var name: js.UndefOr[CapacityNameString] = js.undefined
  
  /**
    * The total capacity on the device.
    */
  var total: js.UndefOr[Long] = js.undefined
  
  /**
    * The unit of measure for the type of capacity.
    */
  var unit: js.UndefOr[CapacityUnitString] = js.undefined
  
  /**
    * The amount of capacity used on the device.
    */
  var used: js.UndefOr[Long] = js.undefined
}
object Capacity {
  
  inline def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  
  extension [Self <: Capacity](x: Self) {
    
    inline def setAvailable(value: Long): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setName(value: CapacityNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTotal(value: Long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setUnit(value: CapacityUnitString): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUsed(value: Long): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
