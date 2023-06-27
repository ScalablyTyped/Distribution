package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeSchemeForPoint
  extends StObject
     with TypeScheme {
  
  /**
  		 * The fill colors of the point symbols comprising the theme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPoint)
  		 */
  var colors: js.Array[Color_]
  
  /**
  		 * The unique name of the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPoint)
  		 */
  var name: String
  
  /**
  		 * The color of the point symbol used to indicate features with no data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPoint)
  		 */
  var noDataColor: Color_
  
  /**
  		 * The opacity of the point symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPoint)
  		 */
  var opacity: Double
  
  /**
  		 * Properties for defining the outline of the marker symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPoint)
  		 */
  var outline: TypeSchemeForPointOutline
  
  /**
  		 * The default size of the point symbol in pixels, points, or real-world units.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPoint)
  		 */
  var size: Double
  
  /**
  		 * Tags associated with the scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemeForPoint)
  		 */
  var tags: js.Array[String]
}
object TypeSchemeForPoint {
  
  inline def apply(
    colors: js.Array[Color_],
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: TypeSchemeForPointOutline,
    size: Double,
    tags: js.Array[String]
  ): TypeSchemeForPoint = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSchemeForPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeSchemeForPoint] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoDataColor(value: Color_): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: TypeSchemeForPointOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
