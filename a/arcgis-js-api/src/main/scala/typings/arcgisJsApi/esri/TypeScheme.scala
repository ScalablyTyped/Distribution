package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.TypeSchemeForPoint
  - typings.arcgisJsApi.esri.TypeSchemeForPolyline
  - typings.arcgisJsApi.esri.TypeSchemeForPolygon
  - typings.arcgisJsApi.esri.TypeSchemeForMesh
*/
trait TypeScheme extends StObject
object TypeScheme {
  
  inline def TypeSchemeForMesh(
    colors: js.Array[Color_],
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.TypeSchemeForMesh = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.TypeSchemeForMesh]
  }
  
  inline def TypeSchemeForPoint(
    colors: js.Array[Color_],
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: TypeSchemeForPointOutline,
    size: Double,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.TypeSchemeForPoint = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.TypeSchemeForPoint]
  }
  
  inline def TypeSchemeForPolygon(
    colors: js.Array[Color_],
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: TypeSchemeForPolygonOutline,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.TypeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.TypeSchemeForPolygon]
  }
  
  inline def TypeSchemeForPolyline(
    colors: js.Array[Color_],
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String],
    width: Double
  ): typings.arcgisJsApi.esri.TypeSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.TypeSchemeForPolyline]
  }
}
