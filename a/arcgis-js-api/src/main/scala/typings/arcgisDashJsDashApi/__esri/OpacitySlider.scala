package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`max-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`min-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-drag`
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
  def on_maxchange(name: `max-change`, eventHandler: OpacitySliderMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: OpacitySliderMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: OpacitySliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: OpacitySliderThumbDragEventHandler): IHandle = js.native
  /**
    * A convenience function used to update the properties of an OpacitySlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#VisualVariableResult) of the [createVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#createVisualVariable) method. This method is useful for cases when the app allows the end user to switch data variables used to render the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#updateFromVisualVariableResult)
    *
    * @param visualVariableResult The result object from the [createVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#createVisualVariable) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateFromVisualVariableResult(visualVariableResult: opacityVisualVariableResult): Unit = js.native
  def updateFromVisualVariableResult(visualVariableResult: opacityVisualVariableResult, histogramResult: HistogramResult): Unit = js.native
}

@JSGlobal("__esri.OpacitySlider")
@js.native
object OpacitySlider extends TopLevel[OpacitySliderConstructor]

