package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSchemeForPointColorsForClassBreaks extends Object {
  
  /**
    * An array of hex color strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPoint)
    */
  var colors: js.Array[Color_] = js.native
  
  /**
    * The number of classes used in the classed color visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPoint)
    */
  var numClasses: Double = js.native
}
object ColorSchemeForPointColorsForClassBreaks {
  
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ColorSchemeForPointColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ColorSchemeForPointColorsForClassBreaks]
  }
  
  @scala.inline
  implicit class ColorSchemeForPointColorsForClassBreaksMutableBuilder[Self <: ColorSchemeForPointColorsForClassBreaks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
  }
}
