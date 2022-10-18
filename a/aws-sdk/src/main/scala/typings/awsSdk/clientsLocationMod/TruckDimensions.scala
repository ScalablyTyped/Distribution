package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruckDimensions extends StObject {
  
  /**
    * The height of the truck.   For example, 4.5.     For routes calculated with a HERE resource, this value must be between 0 and 50 meters.  
    */
  var Height: js.UndefOr[TruckDimensionsHeightDouble] = js.undefined
  
  /**
    * The length of the truck.   For example, 15.5.     For routes calculated with a HERE resource, this value must be between 0 and 300 meters.  
    */
  var Length: js.UndefOr[TruckDimensionsLengthDouble] = js.undefined
  
  /**
    *  Specifies the unit of measurement for the truck dimensions. Default Value: Meters 
    */
  var Unit: js.UndefOr[DimensionUnit] = js.undefined
  
  /**
    * The width of the truck.   For example, 4.5.     For routes calculated with a HERE resource, this value must be between 0 and 50 meters.  
    */
  var Width: js.UndefOr[TruckDimensionsWidthDouble] = js.undefined
}
object TruckDimensions {
  
  inline def apply(): TruckDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruckDimensions]
  }
  
  extension [Self <: TruckDimensions](x: Self) {
    
    inline def setHeight(value: TruckDimensionsHeightDouble): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setLength(value: TruckDimensionsLengthDouble): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "Length", js.undefined)
    
    inline def setUnit(value: DimensionUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    inline def setWidth(value: TruckDimensionsWidthDouble): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
