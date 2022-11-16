package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.LocationSchemeForPoint
  - typings.arcgisJsApi.esri.LocationSchemeForPolyline
  - typings.arcgisJsApi.esri.LocationSchemeForPolygon
  - typings.arcgisJsApi.esri.LocationSchemeForMesh
*/
trait LocationScheme extends StObject
object LocationScheme {
  
  inline def LocationSchemeForMesh(color: Color_, opacity: Double): typings.arcgisJsApi.esri.LocationSchemeForMesh = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.LocationSchemeForMesh]
  }
  
  inline def LocationSchemeForPoint(color: Color_, opacity: Double, outline: LocationSchemeForPointOutline, size: Double): typings.arcgisJsApi.esri.LocationSchemeForPoint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.LocationSchemeForPoint]
  }
  
  inline def LocationSchemeForPolygon(color: Color_, opacity: Double, outline: LocationSchemeForPolygonOutline): typings.arcgisJsApi.esri.LocationSchemeForPolygon = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.LocationSchemeForPolygon]
  }
  
  inline def LocationSchemeForPolyline(color: Color_, opacity: Double, width: Double): typings.arcgisJsApi.esri.LocationSchemeForPolyline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.LocationSchemeForPolyline]
  }
}
