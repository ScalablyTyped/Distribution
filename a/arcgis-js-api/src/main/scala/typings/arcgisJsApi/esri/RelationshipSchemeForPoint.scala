package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipSchemeForPoint
  extends StObject
     with RelationshipScheme {
  
  /**
  		 * Defines the colors to use in each bin of the relationship visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForPointColorsForClassBreaks]
  
  /**
  		 * The ID uniquely identifying the color scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var id: String
  
  /**
  		 * The unique name of the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var name: String
  
  /**
  		 * The color of the point symbol used to indicate features with no data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var noDataColor: Color_
  
  /**
  		 * The opacity of the point symbol (0 - 1).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var opacity: Double
  
  /**
  		 * Properties for defining the outline of the marker symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var outline: RelationshipSchemeForPointOutline
  
  /**
  		 * The size of the point symbol in points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var size: Double
  
  /**
  		 * Tags associated with the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
  		 */
  var tags: js.Array[String]
}
object RelationshipSchemeForPoint {
  
  inline def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPointColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: RelationshipSchemeForPointOutline,
    size: Double,
    tags: js.Array[String]
  ): RelationshipSchemeForPoint = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipSchemeForPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipSchemeForPoint] (val x: Self) extends AnyVal {
    
    inline def setColorsForClassBreaks(value: js.Array[RelationshipSchemeForPointColorsForClassBreaks]): Self = StObject.set(x, "colorsForClassBreaks", value.asInstanceOf[js.Any])
    
    inline def setColorsForClassBreaksVarargs(value: RelationshipSchemeForPointColorsForClassBreaks*): Self = StObject.set(x, "colorsForClassBreaks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoDataColor(value: Color_): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: RelationshipSchemeForPointOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
