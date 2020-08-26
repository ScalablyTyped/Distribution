package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbol3DLayerMaterialProperties extends Object {
  /**
    * The color of the line. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
    *
    * @default white
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
}

object LineSymbol3DLayerMaterialProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LineSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LineSymbol3DLayerMaterialProperties]
  }
  @scala.inline
  implicit class LineSymbol3DLayerMaterialPropertiesOps[Self <: LineSymbol3DLayerMaterialProperties] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

