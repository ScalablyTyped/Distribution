package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reminders extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Reminders_typekey")
  var OutlookDotReminders_typekey: Reminders
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): Reminder
  def Remove(Index: js.Any): Unit
}

object Reminders {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Reminder,
    OutlookDotReminders_typekey: Reminders,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): Reminders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Reminders_typekey")(OutlookDotReminders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reminders]
  }
}

