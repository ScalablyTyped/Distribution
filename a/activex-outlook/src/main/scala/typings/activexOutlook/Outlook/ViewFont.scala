package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewFont extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  var Bold: Boolean
  val Class: OlObjectClass
  var Color: OlColor
  var ExtendedColor: OlCategoryColor
  var Italic: Boolean
  var Name: String
  @JSName("Outlook.ViewFont_typekey")
  var OutlookDotViewFont_typekey: ViewFont
  val Parent: js.Any
  val Session: NameSpace
  var Size: Double
  var Strikethrough: Boolean
  var Underline: Boolean
}

object ViewFont {
  @scala.inline
  def apply(
    Application: Application,
    Bold: Boolean,
    Class: OlObjectClass,
    Color: OlColor,
    ExtendedColor: OlCategoryColor,
    Italic: Boolean,
    Name: String,
    OutlookDotViewFont_typekey: ViewFont,
    Parent: js.Any,
    Session: NameSpace,
    Size: Double,
    Strikethrough: Boolean,
    Underline: Boolean
  ): ViewFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ExtendedColor = ExtendedColor.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewFont_typekey")(OutlookDotViewFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFont]
  }
}

