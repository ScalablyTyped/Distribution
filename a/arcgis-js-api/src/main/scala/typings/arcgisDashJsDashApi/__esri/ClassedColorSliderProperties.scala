package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.average
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.max
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.tick
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedColorSliderProperties extends SmartMappingSliderBaseProperties {
  /**
    * An array of class breaks with associated colors. The colors mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedColorSliderBreaks]] = js.undefined
  /**
    * The view model for the ClassedColorSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ClassedColorSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html) class to access all properties and methods on the ClassedColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ClassedColorSliderViewModelProperties] = js.undefined
}

object ClassedColorSliderProperties {
  @scala.inline
  def apply(
    breaks: js.Array[ClassedColorSliderBreaks] = null,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    histogramConfig: HistogramConfig = null,
    id: String = null,
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double = null,
    label: String = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    viewModel: ClassedColorSliderViewModelProperties = null,
    zoomOptions: SmartMappingSliderBaseZoomOptions = null
  ): ClassedColorSliderProperties = {
    val __obj = js.Dynamic.literal()
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (histogramConfig != null) __obj.updateDynamic("histogramConfig")(histogramConfig.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3(inputFormatFunction))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3(inputParseFunction))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedColorSliderProperties]
  }
}

