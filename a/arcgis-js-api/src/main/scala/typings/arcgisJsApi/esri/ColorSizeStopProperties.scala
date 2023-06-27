package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSizeStopProperties extends StObject {
  
  /**
  		 * The [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#value).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#color)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * A string value used to label the stop in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#label)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * The size value in points used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#value).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#size)
  		 */
  var size: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * Specifies the data value to map to the given [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#size) and [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#color).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#value)
  		 */
  var value: js.UndefOr[Double] = js.undefined
}
object ColorSizeStopProperties {
  
  inline def apply(): ColorSizeStopProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSizeStopProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSizeStopProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
