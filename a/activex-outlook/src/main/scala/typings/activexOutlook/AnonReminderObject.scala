package typings.activexOutlook

import typings.activexOutlook.Outlook.Reminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReminderObject extends js.Object {
  val ReminderObject: Reminder
}

object AnonReminderObject {
  @scala.inline
  def apply(ReminderObject: Reminder): AnonReminderObject = {
    val __obj = js.Dynamic.literal(ReminderObject = ReminderObject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReminderObject]
  }
}

