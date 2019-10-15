package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderProperties extends SmartMappingSliderBaseProperties {
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[SizeStopProperties]] = js.undefined
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    */
  var style: js.UndefOr[SizeSliderStyle] = js.undefined
  /**
    * The view model for the SizeSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [SizeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html) class to access all properties and methods on the SizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[SizeSliderViewModelProperties] = js.undefined
}

object SizeSliderProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    histogramConfig: HistogramConfig = null,
    id: String = null,
    label: String = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    stops: js.Array[SizeStopProperties] = null,
    style: SizeSliderStyle = null,
    viewModel: SizeSliderViewModelProperties = null,
    zoomOptions: SmartMappingSliderBaseZoomOptions = null
  ): SizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (histogramConfig != null) __obj.updateDynamic("histogramConfig")(histogramConfig)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (style != null) __obj.updateDynamic("style")(style)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions)
    __obj.asInstanceOf[SizeSliderProperties]
  }
}

