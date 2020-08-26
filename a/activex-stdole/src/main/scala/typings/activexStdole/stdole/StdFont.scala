package typings.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StdFont extends js.Object {
  val Bold: Boolean = js.native
  val Charset: Double = js.native
  val Italic: Boolean = js.native
  val Name: String = js.native
  val Size: Double = js.native
  val Strikethrough: Boolean = js.native
  val Underline: Boolean = js.native
  val Weight: Double = js.native
  @JSName("stdole.StdFont_typekey")
  var stdoleDotStdFont_typekey: StdFont = js.native
}

object StdFont {
  @scala.inline
  def apply(
    Bold: Boolean,
    Charset: Double,
    Italic: Boolean,
    Name: String,
    Size: Double,
    Strikethrough: Boolean,
    Underline: Boolean,
    Weight: Double,
    stdoleDotStdFont_typekey: StdFont
  ): StdFont = {
    val __obj = js.Dynamic.literal(Bold = Bold.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("stdole.StdFont_typekey")(stdoleDotStdFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdFont]
  }
  @scala.inline
  implicit class StdFontOps[Self <: StdFont] (val x: Self) extends AnyVal {
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
    def setBold(value: Boolean): Self = this.set("Bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharset(value: Double): Self = this.set("Charset", value.asInstanceOf[js.Any])
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("Italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("Strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("Underline", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("Weight", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdoleDotStdFont_typekey(value: StdFont): Self = this.set("stdole.StdFont_typekey", value.asInstanceOf[js.Any])
  }
  
}

