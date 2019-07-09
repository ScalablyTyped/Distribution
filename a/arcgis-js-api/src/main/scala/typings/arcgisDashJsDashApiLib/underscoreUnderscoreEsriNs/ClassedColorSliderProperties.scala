package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
    container: java.lang.String | stdLib.HTMLElement = null,
    destroyed: js.UndefOr[scala.Boolean] = js.undefined,
    histogramConfig: HistogramConfig = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    labelFormatFunction: SmartMappingSliderBaseLabelFormatter = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    viewModel: ClassedColorSliderViewModelProperties = null
  ): ClassedColorSliderProperties = {
    val __obj = js.Dynamic.literal()
    if (breaks != null) __obj.updateDynamic("breaks")(breaks)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (histogramConfig != null) __obj.updateDynamic("histogramConfig")(histogramConfig)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(labelFormatFunction)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[ClassedColorSliderProperties]
  }
}

