package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Reminder")
@js.native
class Reminder protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Caption: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  val IsVisible: scala.Boolean = js.native
  val Item: js.Any = js.native
  val NextReminderDate: stdLib.VarDate = js.native
  val OriginalReminderDate: stdLib.VarDate = js.native
  var `Outlook.Reminder_typekey`: Reminder = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Dismiss(): scala.Unit = js.native
  def Snooze(): scala.Unit = js.native
  def Snooze(SnoozeTime: js.Any): scala.Unit = js.native
}

