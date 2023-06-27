package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapScheme extends StObject {
  
  /**
  		 * A continuous color ramp used to construct a heatmap.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#HeatmapScheme)
  		 */
  var colors: js.Array[Color_]
  
  /**
  		 * The unique id of the color scheme to usee in the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#HeatmapScheme)
  		 */
  var id: String
  
  /**
  		 * The unique name of the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#HeatmapScheme)
  		 */
  var name: String
  
  /**
  		 * The opacity of the heatmap.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#HeatmapScheme)
  		 */
  var opacity: Double
  
  /**
  		 * Tags associated with the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#HeatmapScheme)
  		 */
  var tags: js.Array[String]
}
object HeatmapScheme {
  
  inline def apply(colors: js.Array[Color_], id: String, name: String, opacity: Double, tags: js.Array[String]): HeatmapScheme = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatmapScheme] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
