package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDefaultCreateOptions extends Object {
  /**
    * The default z-value of the newly created geometry. Ignored when `hasZ` is `false` or the layer's elevation mode is set to `absolute-height`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var defaultZ: js.UndefOr[Double] = js.undefined
  /**
    * Controls whether the created geometry has z-values or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var hasZ: js.UndefOr[Boolean] = js.undefined
  /**
    * Create operation mode how the graphic can be created. **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | This is the default. Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline`.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` `rectangle` and `circle`. Default for `rectangle` and `circle`.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var mode: js.UndefOr[String] = js.undefined
}

object SketchDefaultCreateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    defaultZ: Int | Double = null,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    mode: String = null
  ): SketchDefaultCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (defaultZ != null) __obj.updateDynamic("defaultZ")(defaultZ.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchDefaultCreateOptions]
  }
}

