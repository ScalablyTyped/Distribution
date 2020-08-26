package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeTextAlign extends js.Object {
  var color: String = js.native
  var fontSize: Double = js.native
  var textAlign: String = js.native
  var textAlignVertical: String = js.native
}

object FontSizeTextAlign {
  @scala.inline
  def apply(color: String, fontSize: Double, textAlign: String, textAlignVertical: String): FontSizeTextAlign = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeTextAlign]
  }
  @scala.inline
  implicit class FontSizeTextAlignOps[Self <: FontSizeTextAlign] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlignVertical(value: String): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
  }
  
}

