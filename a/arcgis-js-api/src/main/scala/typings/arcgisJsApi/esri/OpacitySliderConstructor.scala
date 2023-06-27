package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacitySliderConstructor
  extends StObject
     with Instantiable0[OpacitySlider]
     with Instantiable1[/* properties */ OpacitySliderProperties, OpacitySlider] {
  
  /**
  		 * A convenience function used to create an OpacitySlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult) of the [createVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#fromVisualVariableResult)
  		 */
  def fromVisualVariableResult(visualVariableResult: opacityVisualVariableResult): OpacitySlider = js.native
  def fromVisualVariableResult(visualVariableResult: opacityVisualVariableResult, histogramResult: HistogramResult): OpacitySlider = js.native
}
