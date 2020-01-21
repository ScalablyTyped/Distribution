package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Category")
@js.native
class Category protected () extends js.Object {
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

