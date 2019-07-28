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
trait ClassedColorSlider extends SmartMappingSliderBase {
  /**
    * An array of class breaks with associated colors. The colors mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var breaks: js.Array[ClassedColorSliderBreaks] = js.native
  /**
    * The view model for the ClassedColorSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ClassedColorSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html) class to access all properties and methods on the ClassedColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#viewModel)
    */
  var viewModel: ClassedColorSliderViewModel = js.native
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: ClassedColorSliderMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: ClassedColorSliderMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: ClassedColorSliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: ClassedColorSliderThumbDragEventHandler): IHandle = js.native
  /**
    * A convenience function used to update the [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) of a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) associated with this slider.  The number of breaks from the renderer must match the number of breaks in the slider. Generally, the input breaks for this method should come from the same renderer as one used to create the slider with the [fromRendererResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#fromRendererResult) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#updateClassBreakInfos)
    *
    * @param breakInfos The classBreakInfos from a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) instance to update based on the properties of the slider.
    *
    */
  def updateClassBreakInfos(breakInfos: js.Array[ClassBreakInfo]): js.Array[ClassBreakInfo] = js.native
  /**
    * A convenience function used to update the properties a ClassedColorSlider from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#updateFromRendererResult)
    *
    * @param rendererResult The result object from the [createClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateFromRendererResult(rendererResult: ClassBreaksRendererResult): Unit = js.native
  def updateFromRendererResult(rendererResult: ClassBreaksRendererResult, histogramResult: HistogramResult): Unit = js.native
}

@JSGlobal("__esri.ClassedColorSlider")
@js.native
/**
  * The ClassedColorSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with color in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html). At a minimum you must set the [breaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks) property of the widget. The breaks are used to set the thumbs and render the color of each slider segment.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html)
  */
class ClassedColorSliderCls () extends ClassedColorSlider {
  def this(properties: ClassedColorSliderProperties) = this()
}

