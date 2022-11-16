package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeSchemeForPolygonOutline extends StObject {
  
  /**
    * The outline color of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var color: Color_
  
  /**
    * The width of the fill symbol's outline in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var width: Double
}
object TypeSchemeForPolygonOutline {
  
  inline def apply(color: Color_, width: Double): TypeSchemeForPolygonOutline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSchemeForPolygonOutline]
  }
  
  extension [Self <: TypeSchemeForPolygonOutline](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
