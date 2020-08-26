package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edges3DProperties extends js.Object {
  /**
    * The color of the edges. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#color)
    *
    * @default black
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * A size in points by which to extend edges beyond their original end points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#extensionLength)
    *
    * @default "0"
    */
  var extensionLength: js.UndefOr[Double | String] = js.native
  /**
    * The size of the edges in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#size)
    *
    * @default 1px
    */
  var size: js.UndefOr[Double | String] = js.native
}

object Edges3DProperties {
  @scala.inline
  def apply(): Edges3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edges3DProperties]
  }
  @scala.inline
  implicit class Edges3DPropertiesOps[Self <: Edges3DProperties] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setExtensionLength(value: Double | String): Self = this.set("extensionLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionLength: Self = this.set("extensionLength", js.undefined)
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

