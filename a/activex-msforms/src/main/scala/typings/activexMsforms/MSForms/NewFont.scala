package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewFont extends js.Object {
  val Bold: Boolean
  val Charset: Double
  val Italic: Boolean
  @JSName("MSForms.NewFont_typekey")
  var MSFormsDotNewFont_typekey: NewFont
  val Name: String
  val Size: Double
  val Strikethrough: Boolean
  val Underline: Boolean
  val Weight: Double
}

object NewFont {
  @scala.inline
  def apply(
    Bold: Boolean,
    Charset: Double,
    Italic: Boolean,
    MSFormsDotNewFont_typekey: NewFont,
    Name: String,
    Size: Double,
    Strikethrough: Boolean,
    Underline: Boolean,
    Weight: Double
  ): NewFont = {
    val __obj = js.Dynamic.literal(Bold = Bold.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.NewFont_typekey")(MSFormsDotNewFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFont]
  }
}

