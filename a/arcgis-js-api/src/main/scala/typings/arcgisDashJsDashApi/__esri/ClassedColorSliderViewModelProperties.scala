package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassedColorSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * An array of class breaks with associated colors. The colors mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedColorSliderViewModelBreaks]] = js.undefined
}

object ClassedColorSliderViewModelProperties {
  @scala.inline
  def apply(
    breaks: js.Array[ClassedColorSliderViewModelBreaks] = null,
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Double = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    thumbsConstrained: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): ClassedColorSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (breaks != null) __obj.updateDynamic("breaks")(breaks)
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3(inputFormatFunction))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3(inputParseFunction))
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbsConstrained)) __obj.updateDynamic("thumbsConstrained")(thumbsConstrained)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ClassedColorSliderViewModelProperties]
  }
}

