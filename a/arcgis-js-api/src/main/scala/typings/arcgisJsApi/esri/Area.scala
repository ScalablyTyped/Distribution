package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Area extends StObject {
  
  /**
    * Unit type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Area)
    */
  var `type`: area
  
  /**
    * Any unit which represents area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Area)
    */
  var unit: AreaUnit
  
  /**
    * Scalar value representing a area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-quantity.html#Area)
    */
  var value: Double
}
object Area {
  
  inline def apply(unit: AreaUnit, value: Double): Area = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("area")
    __obj.asInstanceOf[Area]
  }
  
  extension [Self <: Area](x: Self) {
    
    inline def setType(value: area): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: AreaUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
