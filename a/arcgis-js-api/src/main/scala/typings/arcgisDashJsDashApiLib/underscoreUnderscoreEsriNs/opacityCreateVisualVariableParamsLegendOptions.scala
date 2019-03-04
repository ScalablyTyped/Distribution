package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait opacityCreateVisualVariableParamsLegendOptions
  extends stdLib.Object {
  /**
    * The title used to represent the given field or expression in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#createVisualVariable)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object opacityCreateVisualVariableParamsLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    title: java.lang.String = null
  ): opacityCreateVisualVariableParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[opacityCreateVisualVariableParamsLegendOptions]
  }
}

