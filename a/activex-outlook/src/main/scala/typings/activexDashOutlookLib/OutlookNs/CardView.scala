package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CardView")
@js.native
class CardView protected () extends js.Object {
  var AllowInCellEditing: scala.Boolean = js.native
  val Application: Application = js.native
  val AutoFormatRules: AutoFormatRules = js.native
  val BodyFont: ViewFont = js.native
  val Class: OlObjectClass = js.native
  var Filter: java.lang.String = js.native
  val HeadingsFont: ViewFont = js.native
  var Language: java.lang.String = js.native
  var LockUserChanges: scala.Boolean = js.native
  var MultiLineFieldHeight: scala.Double = js.native
  var Name: java.lang.String = js.native
  var `Outlook.CardView_typekey`: CardView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowEmptyFields: scala.Boolean = js.native
  val SortFields: OrderFields = js.native
  val Standard: scala.Boolean = js.native
  val ViewFields: ViewFields = js.native
  val ViewType: OlViewType = js.native
  var Width: scala.Double = js.native
  var XML: java.lang.String = js.native
  def Apply(): scala.Unit = js.native
  def Copy(Name: java.lang.String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): scala.Unit = js.native
  def GoToDate(Date: stdLib.VarDate): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

