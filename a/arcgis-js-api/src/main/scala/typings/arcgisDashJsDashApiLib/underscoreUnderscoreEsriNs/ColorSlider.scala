package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSlider extends SmartMappingSliderBase {
  /**
    * Only applicable when three thumbs (i.e. handles) are set on the slider [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#values). This property indicates whether the position of the outside handles are synced with the middle, or primary, handle. When enabled, if the primary handle is moved then the outside handle positions are updated while maintaining a fixed distance from the primary handle.  Only applicable when [primaryHandleEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#primaryHandleEnabled) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#handlesSyncedToPrimary)
    *
    * @default true
    */
  var handlesSyncedToPrimary: scala.Boolean = js.native
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default. This is the primary handle. When [handlesSyncedToPrimary](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#handlesSyncedToPrimary) is `true`, then this handle will control the position of the others when moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#primaryHandleEnabled)
    *
    * @default false
    */
  var primaryHandleEnabled: scala.Boolean = js.native
  /**
    * The color stops from the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) to link to the slider. The colors in these stops will be used to render the color gradient on the slider's track. They should match the colors rendered in the associated layer's renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#stops)
    */
  var stops: js.Array[ColorStop] = js.native
  /**
    * The view model for the ColorSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ColorSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html) class to access all properties and methods on the ColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#viewModel)
    */
  var viewModel: ColorSliderViewModel = js.native
  @JSName("on")
  def on_maxchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`max-change`,
    eventHandler: ColorSliderMaxChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_minchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`min-change`,
    eventHandler: ColorSliderMinChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_thumbchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`thumb-change`,
    eventHandler: ColorSliderThumbChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_thumbdrag(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`thumb-drag`,
    eventHandler: ColorSliderThumbDragEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * A convenience function used to update the properties of a ColorSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer) method. This method is useful for cases when the app allows the end user to switch data variables used to render the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#updateFromRendererResult)
    *
    * @param rendererResult The result object from the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateFromRendererResult(rendererResult: ContinuousRendererResult): scala.Unit = js.native
  def updateFromRendererResult(rendererResult: ContinuousRendererResult, histogramResult: HistogramResult): scala.Unit = js.native
}

@JSGlobal("__esri.ColorSlider")
@js.native
/**
  * The ColorSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html). At a minimum you must set the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#min), [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#max), and [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#stops) properties of the widget. The stops are used to render a color gradient on the track of the slider.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html)
  */
class ColorSliderCls () extends ColorSlider {
  def this(properties: ColorSliderProperties) = this()
}

