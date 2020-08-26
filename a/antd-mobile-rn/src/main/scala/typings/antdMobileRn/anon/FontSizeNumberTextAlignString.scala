package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeNumberTextAlignString extends js.Object {
  var fontSize: Double = js.native
  var textAlign: String = js.native
}

object FontSizeNumberTextAlignString {
  @scala.inline
  def apply(fontSize: Double, textAlign: String): FontSizeNumberTextAlignString = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeNumberTextAlignString]
  }
  @scala.inline
  implicit class FontSizeNumberTextAlignStringOps[Self <: FontSizeNumberTextAlignString] (val x: Self) extends AnyVal {
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
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
  }
  
}

