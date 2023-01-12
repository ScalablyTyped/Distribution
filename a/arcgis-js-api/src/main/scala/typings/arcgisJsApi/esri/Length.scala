package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  /**
    * Unit type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Length)
    */
  var `type`: length
  
  /**
    * Any unit which represents length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Length)
    */
  var unit: LengthUnit
  
  /**
    * Scalar value representing a length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Length)
    */
  var value: Double
}
object Length {
  
  inline def apply(unit: LengthUnit, value: Double): Length = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("length")
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    inline def setType(value: length): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: LengthUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
