package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TimelineView")
@js.native
class TimelineView protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  var EndField: String = js.native
  var Filter: String = js.native
  val GroupByFields: OrderFields = js.native
  val ItemFont: ViewFont = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  val LowerScaleFont: ViewFont = js.native
  var MaxLabelWidth: Double = js.native
  var Name: String = js.native
  var `Outlook.TimelineView_typekey`: TimelineView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowLabelWhenViewingByMonth: Boolean = js.native
  var ShowWeekNumbers: Boolean = js.native
  val Standard: Boolean = js.native
  var StartField: String = js.native
  var TimelineViewMode: OlTimelineViewMode = js.native
  val UpperScaleFont: ViewFont = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
}

