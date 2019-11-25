package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIAddPosition extends Object {
  /**
    * The placement index of the component(s). This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var index: Double
  /**
    * The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS. For the other possible values, "top", "bottom", "left", and "right" are consistent placements. The "leading" and "trailing" values depend on whether the browser is using right-to-left (RTL) or left-to-right (LTR). For LTR, "leading" is left and "trailing" is right. For RTL, "leading" is right and "trailing" is left. **Possible Values:** bottom-leading | bottom-left | bottom-right | bottom-trailing | top-leading | top-left | top-right | top-trailing | manual
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var position: js.UndefOr[String] = js.undefined
}

object UIAddPosition {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    index: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    position: String = null
  ): UIAddPosition = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), index = index.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIAddPosition]
  }
}

