package typings.arcgisJsApi.esri

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VertexAttributes extends Object {
  /**
    * The normal buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var normal: js.UndefOr[Float32Array] = js.native
  /**
    * The position buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var position: Float64Array = js.native
  /**
    * The tangent buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var tangent: js.UndefOr[Float32Array] = js.native
}

object VertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VertexAttributes]
  }
  @scala.inline
  implicit class VertexAttributesOps[Self <: VertexAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPosition(value: Float64Array): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: Float32Array): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    @scala.inline
    def setTangent(value: Float32Array): Self = this.set("tangent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTangent: Self = this.set("tangent", js.undefined)
  }
  
}

