package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorRampsColorRamp extends StObject {
  
  /**
  		 * An array of five colors intended for displaying a continuous color ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
  		 */
  var colors: js.Array[Color_]
  
  /**
  		 * Contains an array of ramps ranging in size from 1 color to 10 colors.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
  		 */
  var colorsForClassBreaks: js.Array[ColorRampColorsForClassBreaks]
  
  /**
  		 * The unique name of the color ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
  		 */
  var name: String
  
  /**
  		 * Tags associated with the color ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
  		 */
  var tags: js.Array[String]
}
object colorRampsColorRamp {
  
  inline def apply(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorRampColorsForClassBreaks],
    name: String,
    tags: js.Array[String]
  ): colorRampsColorRamp = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorRampsColorRamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: colorRampsColorRamp] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsForClassBreaks(value: js.Array[ColorRampColorsForClassBreaks]): Self = StObject.set(x, "colorsForClassBreaks", value.asInstanceOf[js.Any])
    
    inline def setColorsForClassBreaksVarargs(value: ColorRampColorsForClassBreaks*): Self = StObject.set(x, "colorsForClassBreaks", js.Array(value*))
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
