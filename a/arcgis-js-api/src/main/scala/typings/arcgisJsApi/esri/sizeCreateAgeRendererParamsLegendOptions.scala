package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeCreateAgeRendererParamsLegendOptions extends Object {
  /**
    * Indicates whether to include the age renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * The title used to represent the age size ramp in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var title: js.UndefOr[String] = js.undefined
}

object sizeCreateAgeRendererParamsLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): sizeCreateAgeRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeCreateAgeRendererParamsLegendOptions]
  }
}

