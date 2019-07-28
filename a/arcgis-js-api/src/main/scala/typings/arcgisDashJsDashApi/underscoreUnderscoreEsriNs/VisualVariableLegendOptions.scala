package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariableLegendOptions extends Object {
  /**
    * Indicates whether to show the visual variable in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * The title describing the visualization of the visual variable in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). This takes precedence over a field alias or [valueExpressionTitle](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpressionTitle).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var title: js.UndefOr[String] = js.undefined
}

object VisualVariableLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): VisualVariableLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VisualVariableLegendOptions]
  }
}

