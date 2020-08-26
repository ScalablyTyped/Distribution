package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAlignVertical extends js.Object {
  var color: String = js.native
  var fontSize: Double = js.native
  var marginRight: Double = js.native
  var textAlignVertical: String = js.native
}

object TextAlignVertical {
  @scala.inline
  def apply(color: String, fontSize: Double, marginRight: Double, textAlignVertical: String): TextAlignVertical = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlignVertical]
  }
  @scala.inline
  implicit class TextAlignVerticalOps[Self <: TextAlignVertical] (val x: Self) extends AnyVal {
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
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlignVertical(value: String): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
  }
  
}

