package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeSlider
  extends StObject
     with SmartMappingSliderBase {
  
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops)
    */
  var stops: js.Array[SizeStop] = js.native
  
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    */
  var style: SizeSliderStyle = js.native
  
  /**
    * A convenience function used to update the properties of a SizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#updateFromRendererResult)
    */
  def updateFromRendererResult(rendererResult: sizeContinuousRendererResult): Unit = js.native
  def updateFromRendererResult(rendererResult: sizeContinuousRendererResult, histogramResult: HistogramResult): Unit = js.native
  
  /**
    * A convenience function used to update the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to match the values of the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops) on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#updateVisualVariable)
    */
  def updateVisualVariable(sizeVariable: SizeVariable): SizeVariable = js.native
  
  /**
    * The view model for the SizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#viewModel)
    */
  var viewModel: SizeSliderViewModel = js.native
}
