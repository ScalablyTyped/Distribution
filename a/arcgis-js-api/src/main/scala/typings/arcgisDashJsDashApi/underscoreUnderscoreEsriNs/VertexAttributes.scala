package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexAttributes extends Object {
  /**
    * The normal buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var normal: js.UndefOr[Float32Array] = js.undefined
  /**
    * The position buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var position: Float64Array
}

object VertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean,
    normal: Float32Array = null
  ): VertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (normal != null) __obj.updateDynamic("normal")(normal)
    __obj.asInstanceOf[VertexAttributes]
  }
}

