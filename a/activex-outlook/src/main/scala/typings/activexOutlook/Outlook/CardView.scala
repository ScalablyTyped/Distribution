package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CardView")
@js.native
class CardView protected () extends js.Object {
  var AllowInCellEditing: Boolean = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  val BodyFont: ViewFont = js.native
  val Class: OlObjectClass = js.native
  var Filter: String = js.native
  val HeadingsFont: ViewFont = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  var MultiLineFieldHeight: Double = js.native
  var Name: String = js.native
  @JSName("Outlook.CardView_typekey")
  var OutlookDotCardView_typekey: CardView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowEmptyFields: Boolean = js.native
  val SortFields: OrderFields = js.native
  val Standard: Boolean = js.native
  val ViewFields: typings.activexOutlook.Outlook.ViewFields = js.native
  val ViewType: OlViewType = js.native
  var Width: Double = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
}

