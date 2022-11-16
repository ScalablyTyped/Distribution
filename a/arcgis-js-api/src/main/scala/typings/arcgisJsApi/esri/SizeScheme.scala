package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.SizeSchemeForPoint
  - typings.arcgisJsApi.esri.SizeSchemeForPolyline
  - typings.arcgisJsApi.esri.SizeSchemeForPolygon
*/
trait SizeScheme extends StObject
object SizeScheme {
  
  inline def SizeSchemeForPoint(
    color: Color_,
    maxSize: Double,
    minSize: Double,
    noDataColor: Color_,
    noDataSize: Double,
    opacity: Double,
    outline: SizeSchemeForPointOutline,
    size: Double
  ): typings.arcgisJsApi.esri.SizeSchemeForPoint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataSize = noDataSize.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SizeSchemeForPoint]
  }
  
  inline def SizeSchemeForPolygon(background: SizeSchemeForPolygonBackground, marker: SizeSchemeForPoint, opacity: Double): typings.arcgisJsApi.esri.SizeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SizeSchemeForPolygon]
  }
  
  inline def SizeSchemeForPolyline(
    color: Color_,
    maxWidth: Double,
    minWidth: Double,
    noDataColor: Color_,
    noDataWidth: Double,
    opacity: Double,
    width: Double
  ): typings.arcgisJsApi.esri.SizeSchemeForPolyline = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataWidth = noDataWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SizeSchemeForPolyline]
  }
}
