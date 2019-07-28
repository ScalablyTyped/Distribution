package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`max-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`min-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-drag`
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
    * The view model for the SizeSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [SizeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html) class to access all properties and methods on the SizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#viewModel)
    */
  var viewModel: SizeSliderViewModel = js.native
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: SizeSliderMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: SizeSliderMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: SizeSliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: SizeSliderThumbDragEventHandler): IHandle = js.native
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
/**
  * The SizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html). At a minimum you must set the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#min), [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#max), and [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops) properties of the widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html)
  */
class SizeSliderCls () extends SizeSlider {
  def this(properties: SizeSliderProperties) = this()
}

