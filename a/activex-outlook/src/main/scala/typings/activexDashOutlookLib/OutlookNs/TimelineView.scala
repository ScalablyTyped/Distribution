package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TimelineView")
@js.native
class TimelineView protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  var EndField: java.lang.String = js.native
  var Filter: java.lang.String = js.native
  val GroupByFields: OrderFields = js.native
  val ItemFont: ViewFont = js.native
  var Language: java.lang.String = js.native
  var LockUserChanges: scala.Boolean = js.native
  val LowerScaleFont: ViewFont = js.native
  var MaxLabelWidth: scala.Double = js.native
  var Name: java.lang.String = js.native
  var `Outlook.TimelineView_typekey`: TimelineView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowLabelWhenViewingByMonth: scala.Boolean = js.native
  var ShowWeekNumbers: scala.Boolean = js.native
  val Standard: scala.Boolean = js.native
  var StartField: java.lang.String = js.native
  var TimelineViewMode: OlTimelineViewMode = js.native
  val UpperScaleFont: ViewFont = js.native
  val ViewType: OlViewType = js.native
  var XML: java.lang.String = js.native
  def Apply(): scala.Unit = js.native
  def Copy(Name: java.lang.String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): scala.Unit = js.native
  def GoToDate(Date: stdLib.VarDate): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

