package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.angle
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle
  extends StObject
     with Object {
  
  /**
    * Unit type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Angle)
    */
  var `type`: angle
  
  /**
    * Any unit which represents an angle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Angle)
    */
  var unit: AngleUnit
  
  /**
    * Scalar value representing a angle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Angle)
    */
  var value: Double
}
object Angle {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    unit: AngleUnit,
    value: Double
  ): Angle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("angle")
    __obj.asInstanceOf[Angle]
  }
  
  extension [Self <: Angle](x: Self) {
    
    inline def setType(value: angle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: AngleUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
