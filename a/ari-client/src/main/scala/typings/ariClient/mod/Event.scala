package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends Message {
  /**
    * Name of the application receiving the event.
    */
  var application: String
  /**
    * Time at which this event was created.
    */
  var timestamp: Date
}

object Event {
  @scala.inline
  def apply(application: String, timestamp: Date, `type`: String, asterisk_id: String = null): Event = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

