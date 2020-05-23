package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val CategoryBorderColor: OLE_COLOR
  val CategoryGradientBottomColor: OLE_COLOR
  val CategoryGradientTopColor: OLE_COLOR
  val CategoryID: String
  val Class: OlObjectClass
  var Color: OlCategoryColor
  var Name: String
  @JSName("Outlook.Category_typekey")
  var OutlookDotCategory_typekey: Category
  val Parent: js.Any
  val Session: NameSpace
  var ShortcutKey: OlCategoryShortcutKey
}

object Category {
  @scala.inline
  def apply(
    Application: Application,
    CategoryBorderColor: OLE_COLOR,
    CategoryGradientBottomColor: OLE_COLOR,
    CategoryGradientTopColor: OLE_COLOR,
    CategoryID: String,
    Class: OlObjectClass,
    Color: OlCategoryColor,
    Name: String,
    OutlookDotCategory_typekey: Category,
    Parent: js.Any,
    Session: NameSpace,
    ShortcutKey: OlCategoryShortcutKey
  ): Category = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CategoryBorderColor = CategoryBorderColor.asInstanceOf[js.Any], CategoryGradientBottomColor = CategoryGradientBottomColor.asInstanceOf[js.Any], CategoryGradientTopColor = CategoryGradientTopColor.asInstanceOf[js.Any], CategoryID = CategoryID.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShortcutKey = ShortcutKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Category_typekey")(OutlookDotCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

