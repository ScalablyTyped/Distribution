package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineCallout3DProperties extends Callout3DProperties {
  /**
    * The border settings of the callout line. The border of the callout line can be used to improve the contrast of the callout line color against various background colors. If the border is `null`, then no border will be visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var border: js.UndefOr[LineCallout3DBorderProperties] = js.native
  /**
    * The color of the callout line. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#color)
    *
    * @default black
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The width of the callout line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#size)
    *
    * @default 1px
    */
  var size: js.UndefOr[Double | String] = js.native
  var `type`: js.UndefOr[line] = js.native
}

object LineCallout3DProperties {
  @scala.inline
  def apply(): LineCallout3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineCallout3DProperties]
  }
  @scala.inline
  implicit class LineCallout3DPropertiesOps[Self <: LineCallout3DProperties] (val x: Self) extends AnyVal {
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
    def setBorder(value: LineCallout3DBorderProperties): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: line): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

