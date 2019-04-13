package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueConfigurationDeprecated extends js.Object {
  var Event: js.UndefOr[Event] = js.undefined
  /**
    * 
    */
  var Events: js.UndefOr[EventList] = js.undefined
  var Id: js.UndefOr[NotificationId] = js.undefined
  /**
    * 
    */
  var Queue: js.UndefOr[QueueArn] = js.undefined
}

object QueueConfigurationDeprecated {
  @scala.inline
  def apply(Event: Event = null, Events: EventList = null, Id: NotificationId = null, Queue: QueueArn = null): QueueConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    __obj.asInstanceOf[QueueConfigurationDeprecated]
  }
}

