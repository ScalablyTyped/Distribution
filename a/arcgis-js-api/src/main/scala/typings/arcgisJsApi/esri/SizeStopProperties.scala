package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeStopProperties extends StObject {
  
  /**
  		 * A string value used to label the stop in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#label)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * The size value in points (between `0` and `90`) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#value).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#size)
  		 */
  var size: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * Specifies the data value to map to the given [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#size).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-SizeStop.html#value)
  		 */
  var value: js.UndefOr[Double] = js.undefined
}
object SizeStopProperties {
  
  inline def apply(): SizeStopProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeStopProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeStopProperties] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
