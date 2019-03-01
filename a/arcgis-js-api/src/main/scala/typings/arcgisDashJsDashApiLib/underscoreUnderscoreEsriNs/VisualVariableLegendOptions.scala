package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariableLegendOptions
  extends stdLib.Object {
  /**
    * Indicates whether to show the visual variable in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var showLegend: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The title describing the visualization of the visual variable in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). This takes precedence over a field alias or [valueExpressionTitle](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpressionTitle).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object VisualVariableLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    showLegend: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): VisualVariableLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VisualVariableLegendOptions]
  }
}

