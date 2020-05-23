package typings.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StdFont extends js.Object {
  val Bold: Boolean
  val Charset: Double
  val Italic: Boolean
  val Name: String
  val Size: Double
  val Strikethrough: Boolean
  val Underline: Boolean
  val Weight: Double
  @JSName("stdole.StdFont_typekey")
  var stdoleDotStdFont_typekey: StdFont
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
}

