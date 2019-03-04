package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCreateDrawOptions
  extends stdLib.Object {
  /**
    * The drawing mode. The drawing mode applies only when creating `polygon`, `polyline`, `segment` draw actions.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline` draw actions.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` and `segment` draw actions. Default for `segment` draw actions.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-draw-Draw.html#create)
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object DrawCreateDrawOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    mode: java.lang.String = null
  ): DrawCreateDrawOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[DrawCreateDrawOptions]
  }
}

