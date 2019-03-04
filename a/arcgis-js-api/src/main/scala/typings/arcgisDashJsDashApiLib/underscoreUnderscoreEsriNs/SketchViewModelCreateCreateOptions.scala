package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelCreateCreateOptions
  extends stdLib.Object {
  /**
    * Specifies how the graphic can be created. The create mode applies only when creating `polygon`, `polyline`, `rectangle` and `circle` geometries.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline`.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` `rectangle` and `circle`. Default for `rectangle` and `circle`.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    */
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object SketchViewModelCreateCreateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    mode: java.lang.String = null
  ): SketchViewModelCreateCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[SketchViewModelCreateCreateOptions]
  }
}

