package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacitySliderViewModelProperties extends SliderViewModelProperties {
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider. The opacity values in these stops will be used to render the gradient on the slider. They should match the opacity rendered in the associated layer's opacity visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider-OpacitySliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.undefined
}

object OpacitySliderViewModelProperties {
  @scala.inline
  def apply(
    inputFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    inputParseFunction: (/* value */ String, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Double = null,
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    precision: Int | Double = null,
    stops: js.Array[OpacityStopProperties] = null,
    thumbsConstrained: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): OpacitySliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (inputFormatFunction != null) __obj.updateDynamic("inputFormatFunction")(js.Any.fromFunction3(inputFormatFunction))
    if (inputParseFunction != null) __obj.updateDynamic("inputParseFunction")(js.Any.fromFunction3(inputParseFunction))
    if (labelFormatFunction != null) __obj.updateDynamic("labelFormatFunction")(js.Any.fromFunction3(labelFormatFunction))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (!js.isUndefined(thumbsConstrained)) __obj.updateDynamic("thumbsConstrained")(thumbsConstrained)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[OpacitySliderViewModelProperties]
  }
}

