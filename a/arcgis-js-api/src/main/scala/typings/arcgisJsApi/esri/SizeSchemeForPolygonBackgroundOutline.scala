package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSchemeForPolygonBackgroundOutline extends StObject {
  
  /**
    * The outline color of the background fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var color: Color_
  
  /**
    * The width of the background fill symbol's outline in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var width: Double
}
object SizeSchemeForPolygonBackgroundOutline {
  
  inline def apply(color: Color_, width: Double): SizeSchemeForPolygonBackgroundOutline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSchemeForPolygonBackgroundOutline]
  }
  
  extension [Self <: SizeSchemeForPolygonBackgroundOutline](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
