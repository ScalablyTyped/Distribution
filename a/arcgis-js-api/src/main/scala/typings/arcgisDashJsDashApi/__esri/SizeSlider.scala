package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSlider extends SmartMappingSliderBase {
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
    * The view model for the SizeSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [SizeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html) class to access all properties and methods on the SizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#viewModel)
    */
  var viewModel: SizeSliderViewModel = js.native
  /**
    * A convenience function used to update the properties of a SizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createContinuousRenderer) method. This method is useful for cases when the app allows the end user to switch data variables used to render the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#updateFromRendererResult)
    *
    * @param rendererResult The result object from the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createContinuousRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateFromRendererResult(rendererResult: sizeContinuousRendererResult): Unit = js.native
  def updateFromRendererResult(rendererResult: sizeContinuousRendererResult, histogramResult: HistogramResult): Unit = js.native
  /**
    * A convenience function used to update the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to match the values of the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops) on the slider.  This is particularly useful for Size visual variables that have a set [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue) and [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue). This method will properly reconstruct the variable to set on the renderer so it matches the stops on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#updateVisualVariable)
    *
    * @param sizeVariable The size visual variable from the renderer to update to the set [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops) on the slider.
    *
    */
  def updateVisualVariable(sizeVariable: SizeVariable): SizeVariable = js.native
}

@JSGlobal("__esri.SizeSlider")
@js.native
object SizeSlider extends TopLevel[SizeSliderConstructor]

