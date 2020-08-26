package typings.amapJsApi.AMap.LabelMarker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  var fillColor: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[FontWeight] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

