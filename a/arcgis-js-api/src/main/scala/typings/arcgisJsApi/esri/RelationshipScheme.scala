package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.RelationshipSchemeForPoint
  - typings.arcgisJsApi.esri.RelationshipSchemeForPolyline
  - typings.arcgisJsApi.esri.RelationshipSchemeForPolygon
  - typings.arcgisJsApi.esri.RelationshipSchemeForMesh
*/
trait RelationshipScheme extends StObject
object RelationshipScheme {
  
  inline def RelationshipSchemeForMesh(
    colorsForClassBreaks: js.Array[RelationshipSchemeForMeshColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.RelationshipSchemeForMesh = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.RelationshipSchemeForMesh]
  }
  
  inline def RelationshipSchemeForPoint(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPointColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: RelationshipSchemeForPointOutline,
    size: Double,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.RelationshipSchemeForPoint = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.RelationshipSchemeForPoint]
  }
  
  inline def RelationshipSchemeForPolygon(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolygonColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: RelationshipSchemeForPolygonOutline,
    tags: js.Array[String]
  ): typings.arcgisJsApi.esri.RelationshipSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.RelationshipSchemeForPolygon]
  }
  
  inline def RelationshipSchemeForPolyline(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String],
    width: Double
  ): typings.arcgisJsApi.esri.RelationshipSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.RelationshipSchemeForPolyline]
  }
}
