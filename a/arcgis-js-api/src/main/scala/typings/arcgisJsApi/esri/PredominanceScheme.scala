package typings.arcgisJsApi.esri

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.PredominanceSchemeForPoint
  - typings.arcgisJsApi.esri.PredominanceSchemeForPolyline
  - typings.arcgisJsApi.esri.PredominanceSchemeForPolygon
  - typings.arcgisJsApi.esri.PredominanceSchemeForMesh
*/
trait PredominanceScheme extends StObject
object PredominanceScheme {
  
  inline def PredominanceSchemeForMesh(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.PredominanceSchemeForMesh = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.PredominanceSchemeForMesh]
  }
  
  inline def PredominanceSchemeForPoint(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: PredominanceSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    sizeScheme: SizeSchemeForPoint,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.PredominanceSchemeForPoint = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sizeScheme = sizeScheme.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.PredominanceSchemeForPoint]
  }
  
  inline def PredominanceSchemeForPolygon(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: PredominanceSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    sizeScheme: SizeSchemeForPolygon,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.PredominanceSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sizeScheme = sizeScheme.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.PredominanceSchemeForPolygon]
  }
  
  inline def PredominanceSchemeForPolyline(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    sizeScheme: SizeSchemeForPolyline,
    tags: js.Array[String],
    width: Double
  ): typings.arcgisJsApi.esri.PredominanceSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sizeScheme = sizeScheme.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.PredominanceSchemeForPolyline]
  }
}
