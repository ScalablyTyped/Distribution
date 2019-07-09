package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacitySlider extends SmartMappingSliderBase {
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider. The opacity values in these stops will be used to render the gradient on the slider. They should match the opacity rendered in the associated layer's opacity visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#stops)
    */
  var stops: js.Array[OpacityStop] = js.native
  /**
    * The view model for the OpacitySlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [OpacitySliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html) class to access all properties and methods on the OpacitySlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#viewModel)
    */
  var viewModel: OpacitySliderViewModel = js.native
  @JSName("on")
  def on_maxchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`max-change`,
    eventHandler: OpacitySliderMaxChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_minchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`min-change`,
    eventHandler: OpacitySliderMinChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_thumbchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`thumb-change`,
    eventHandler: OpacitySliderThumbChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_thumbdrag(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`thumb-drag`,
    eventHandler: OpacitySliderThumbDragEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * A convenience function used to update the properties of an OpacitySlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#VisualVariableResult) of the [createVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#createVisualVariable) method. This method is useful for cases when the app allows the end user to switch data variables used to render the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#updateFromVisualVariableResult)
    *
    * @param visualVariableResult The result object from the [createVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#createVisualVariable) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateFromVisualVariableResult(visualVariableResult: opacityVisualVariableResult): scala.Unit = js.native
  def updateFromVisualVariableResult(visualVariableResult: opacityVisualVariableResult, histogramResult: HistogramResult): scala.Unit = js.native
}

@JSGlobal("__esri.OpacitySlider")
@js.native
/**
  * The OpacitySlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with an [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html). At a minimum you must set the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#min), [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#max), and [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#stops) properties of the widget. The stops are used to render the opacity gradient on the track of the slider.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html)
  */
class OpacitySliderCls () extends OpacitySlider {
  def this(properties: OpacitySliderProperties) = this()
}

