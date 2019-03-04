package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexAttributes
  extends stdLib.Object {
  /**
    * The normal buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var normal: js.UndefOr[stdLib.Float32Array] = js.undefined
  /**
    * The position buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var position: stdLib.Float64Array
}

object VertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    position: stdLib.Float64Array,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    normal: stdLib.Float32Array = null
  ): VertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, position = position, propertyIsEnumerable = propertyIsEnumerable)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    __obj.asInstanceOf[VertexAttributes]
  }
}

