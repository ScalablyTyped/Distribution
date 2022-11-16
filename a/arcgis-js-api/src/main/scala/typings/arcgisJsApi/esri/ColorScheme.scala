package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.ColorSchemeForPoint
  - typings.arcgisJsApi.esri.ColorSchemeForPolyline
  - typings.arcgisJsApi.esri.ColorSchemeForPolygon
  - typings.arcgisJsApi.esri.ColorSchemeForMesh
*/
trait ColorScheme extends StObject
object ColorScheme {
  
  inline def ColorSchemeForMesh(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForMeshColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String],
    theme: String
  ): typings.arcgisJsApi.esri.ColorSchemeForMesh = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ColorSchemeForMesh]
  }
  
  inline def ColorSchemeForPoint(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPointColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: ColorSchemeForPointOutline,
    size: Double,
    tags: js.Array[String],
    theme: String
  ): typings.arcgisJsApi.esri.ColorSchemeForPoint = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ColorSchemeForPoint]
  }
  
  inline def ColorSchemeForPolygon(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPolygonColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: ColorSchemeForPolygonOutline,
    tags: js.Array[String],
    theme: String
  ): typings.arcgisJsApi.esri.ColorSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ColorSchemeForPolygon]
  }
  
  inline def ColorSchemeForPolyline(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPolylineColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String],
    theme: String,
    width: Double
  ): typings.arcgisJsApi.esri.ColorSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ColorSchemeForPolyline]
  }
}
