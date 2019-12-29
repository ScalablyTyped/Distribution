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

trait ColorSliderProperties extends SmartMappingSliderBaseProperties {
  /**
    * Only applicable when three thumbs (i.e. handles) are set on the slider [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#values). This property indicates whether the position of the outside handles are synced with the middle, or primary, handle. When enabled, if the primary handle is moved then the outside handle positions are updated while maintaining a fixed distance from the primary handle.  Only applicable when [primaryHandleEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#primaryHandleEnabled) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#handlesSyncedToPrimary)
    *
    * @default true
    */
  var handlesSyncedToPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default. This is the primary handle. When [handlesSyncedToPrimary](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#handlesSyncedToPrimary) is `true`, then this handle will control the position of the others when moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#primaryHandleEnabled)
    *
    * @default false
    */
  var primaryHandleEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The color stops from the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) to link to the slider. The colors in these stops will be used to render the color gradient on the slider's track. They should match the colors rendered in the associated layer's renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorStopProperties]] = js.undefined
  /**
    * The view model for the ColorSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ColorSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html) class to access all properties and methods on the ColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ColorSliderViewModelProperties] = js.undefined
}

object ColorSliderProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    handlesSyncedToPrimary: js.UndefOr[Boolean] = js.undefined,
    histogramConfig: HistogramConfig = null,
    id: String = null,
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double = null,
    label: String = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    primaryHandleEnabled: js.UndefOr[Boolean] = js.undefined,
    stops: js.Array[ColorStopProperties] = null,
    viewModel: ColorSliderViewModelProperties = null,
    zoomOptions: SmartMappingSliderBaseZoomOptions = null
  ): ColorSliderProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (!js.isUndefined(handlesSyncedToPrimary)) __obj.updateDynamic("handlesSyncedToPrimary")(handlesSyncedToPrimary.asInstanceOf[js.Any])
    if (histogramConfig != null) __obj.updateDynamic("histogramConfig")(histogramConfig.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3(inputFormatFunction))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3(inputParseFunction))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryHandleEnabled)) __obj.updateDynamic("primaryHandleEnabled")(primaryHandleEnabled.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSliderProperties]
  }
}

