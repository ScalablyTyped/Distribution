package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeRampStop
  extends stdLib.Object {
  /**
    * The label in the legend describing features with the given `symbol` and `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var label: java.lang.String
  /**
    * The width of the outline in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var outlineSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTML element rendered in the legend representing features with the given value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var preview: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * The size of the visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops) in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * The symbol corresponding to the value of the stop in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var symbol: Symbol
  /**
    * The value of the size visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampStop)
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object SizeRampStop {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    symbol: Symbol,
    outlineSize: scala.Int | scala.Double = null,
    preview: stdLib.HTMLElement = null,
    size: scala.Int | scala.Double = null,
    value: js.Any = null
  ): SizeRampStop = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol)
    if (outlineSize != null) __obj.updateDynamic("outlineSize")(outlineSize.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SizeRampStop]
  }
}

