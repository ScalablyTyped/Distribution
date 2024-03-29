package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipSchemeForPolyline
  extends StObject
     with RelationshipScheme {
  
  /**
  		 * Defines the colors to use in each bin of the relationship visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
  		 */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks]
  
  /**
  		 * The ID uniquely identifying the color scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
  		 */
  var id: String
  
  /**
  		 * The unique name of the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
  		 */
  var name: String
  
  /**
  		 * The color of the line symbol used to indicate features with no data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
  		 */
  var noDataColor: Color_
  
  /**
  		 * The opacity of the line symbol (0 - 1).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
  		 */
  var opacity: Double
  
  /**
  		 * Tags associated with the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
  		 */
  var tags: js.Array[String]
  
  /**
  		 * The width of the line symbol in points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
  		 */
  var width: Double
}
object RelationshipSchemeForPolyline {
  
  inline def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String],
    width: Double
  ): RelationshipSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipSchemeForPolyline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipSchemeForPolyline] (val x: Self) extends AnyVal {
    
    inline def setColorsForClassBreaks(value: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks]): Self = StObject.set(x, "colorsForClassBreaks", value.asInstanceOf[js.Any])
    
    inline def setColorsForClassBreaksVarargs(value: RelationshipSchemeForPolylineColorsForClassBreaks*): Self = StObject.set(x, "colorsForClassBreaks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoDataColor(value: Color_): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
