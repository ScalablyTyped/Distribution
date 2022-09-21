package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSizeSlider
  extends StObject
     with SmartMappingSliderBase {
  
  /**
    * Only applicable when three thumbs (i.e.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#handlesSyncedToPrimary)
    */
  var handlesSyncedToPrimary: Boolean = js.native
  
  /**
    * Only applicable when three thumbs (i.e.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#persistSizeRangeEnabled)
    */
  var persistSizeRangeEnabled: Boolean = js.native
  
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#primaryHandleEnabled)
    */
  var primaryHandleEnabled: Boolean = js.native
  
  /**
    * The colors and sizes corresponding with data values in the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) of the renderer associated with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#stops)
    */
  var stops: js.Array[ColorSizeStop] = js.native
  
  /**
    * A convenience function used to update the properties of a ColorSizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult) of the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#updateFromRendererResult)
    */
  def updateFromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult): scala.Unit = js.native
  def updateFromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult, histogramResult: HistogramResult): scala.Unit = js.native
  
  /**
    * A convenience function used to update a renderer generated with the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method with the values obtained from the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#updateRenderer)
    */
  def updateRenderer(renderer: ClassBreaksRenderer): ClassBreaksRenderer = js.native
  
  /**
    * A convenience function used to update the visual variables of a renderer generated with the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method with the values obtained from the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#updateVisualVariables)
    */
  def updateVisualVariables(variables: js.Array[ColorVariable | SizeVariable]): js.Array[ColorVariable | SizeVariable] = js.native
  
  /**
    * The view model for the ColorSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#viewModel)
    */
  var viewModel: ColorSizeSliderViewModel = js.native
}
