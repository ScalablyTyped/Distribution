package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipSchemeForMesh
  extends StObject
     with RelationshipScheme {
  
  /**
  		 * Defines the colors to use in each bin of the relationship visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
  		 */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForMeshColorsForClassBreaks]
  
  /**
  		 * The ID uniquely identifying the color scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
  		 */
  var id: String
  
  /**
  		 * The unique name of the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
  		 */
  var name: String
  
  /**
  		 * The color of the fill symbol used to indicate features with no data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
  		 */
  var noDataColor: Color_
  
  /**
  		 * The opacity of the fill symbol (0 - 1).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
  		 */
  var opacity: Double
  
  /**
  		 * Tags associated with the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
  		 */
  var tags: js.Array[String]
}
object RelationshipSchemeForMesh {
  
  inline def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForMeshColorsForClassBreaks],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String]
  ): RelationshipSchemeForMesh = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipSchemeForMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipSchemeForMesh] (val x: Self) extends AnyVal {
    
    inline def setColorsForClassBreaks(value: js.Array[RelationshipSchemeForMeshColorsForClassBreaks]): Self = StObject.set(x, "colorsForClassBreaks", value.asInstanceOf[js.Any])
    
    inline def setColorsForClassBreaksVarargs(value: RelationshipSchemeForMeshColorsForClassBreaks*): Self = StObject.set(x, "colorsForClassBreaks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoDataColor(value: Color_): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
