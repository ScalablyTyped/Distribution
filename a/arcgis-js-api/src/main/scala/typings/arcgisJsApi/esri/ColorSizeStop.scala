package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSizeStop
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#value).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * A string value used to label the stop in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#label)
  		 */
  var label: String = js.native
  
  /**
  		 * The size value in points used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#value).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#size)
  		 */
  var size: Double = js.native
  
  /**
  		 * Specifies the data value to map to the given [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#size) and [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#color).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html#value)
  		 */
  var value: Double = js.native
}
