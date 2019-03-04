package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorCreateVisualVariableParamsLegendOptions
  extends stdLib.Object {
  /**
    * Indicates whether to describe the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createVisualVariable)
    */
  var showLegend: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The title used to represent the given field or expression in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createVisualVariable)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object colorCreateVisualVariableParamsLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    showLegend: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): colorCreateVisualVariableParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[colorCreateVisualVariableParamsLegendOptions]
  }
}

