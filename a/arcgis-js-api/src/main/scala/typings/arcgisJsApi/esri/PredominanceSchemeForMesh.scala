package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredominanceSchemeForMesh
  extends StObject
     with PredominanceScheme {
  
  /**
  		 * The fill colors of the mesh symbols used for each category.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForMesh)
  		 */
  var colors: js.Array[Color_]
  
  /**
  		 * The unique name of the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForMesh)
  		 */
  var name: String
  
  /**
  		 * The color of the fill symbol used to indicate features with no data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForMesh)
  		 */
  var noDataColor: Color_
  
  /**
  		 * The opacity of the symbol (0 - 1).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForMesh)
  		 */
  var opacity: Double
  
  /**
  		 * Tags associated with the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForMesh)
  		 */
  var tags: js.Array[String]
}
object PredominanceSchemeForMesh {
  
  inline def apply(
    colors: js.Array[Color_],
    name: String,
    noDataColor: Color_,
    opacity: Double,
    tags: js.Array[String]
  ): PredominanceSchemeForMesh = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominanceSchemeForMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredominanceSchemeForMesh] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoDataColor(value: Color_): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
