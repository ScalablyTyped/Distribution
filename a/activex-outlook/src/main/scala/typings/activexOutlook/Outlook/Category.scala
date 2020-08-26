package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val CategoryBorderColor: OLE_COLOR = js.native
  val CategoryGradientBottomColor: OLE_COLOR = js.native
  val CategoryGradientTopColor: OLE_COLOR = js.native
  val CategoryID: String = js.native
  val Class: OlObjectClass = js.native
  var Color: OlCategoryColor = js.native
  var Name: String = js.native
  @JSName("Outlook.Category_typekey")
  var OutlookDotCategory_typekey: Category = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var ShortcutKey: OlCategoryShortcutKey = js.native
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
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryBorderColor(value: OLE_COLOR): Self = this.set("CategoryBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryGradientBottomColor(value: OLE_COLOR): Self = this.set("CategoryGradientBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryGradientTopColor(value: OLE_COLOR): Self = this.set("CategoryGradientTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryID(value: String): Self = this.set("CategoryID", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: OlCategoryColor): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotCategory_typekey(value: Category): Self = this.set("Outlook.Category_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortcutKey(value: OlCategoryShortcutKey): Self = this.set("ShortcutKey", value.asInstanceOf[js.Any])
  }
  
}

