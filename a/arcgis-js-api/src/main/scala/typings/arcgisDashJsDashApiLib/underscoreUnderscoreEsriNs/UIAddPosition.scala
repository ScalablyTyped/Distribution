package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIAddPosition
  extends stdLib.Object {
  /**
    * The placement index of the component(s). This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var index: scala.Double
  /**
    * The position in the view at which to add the component(s). If not specified, `manual` is used by default. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object UIAddPosition {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    index: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    position: java.lang.String = null
  ): UIAddPosition = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), index = index, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[UIAddPosition]
  }
}

