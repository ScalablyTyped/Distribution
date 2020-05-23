package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationMoveFailed extends Event {
  var args: String | js.Array[String]
  /* Properties */
  var channel: Channel
  var destination: String
}

object ApplicationMoveFailed {
  @scala.inline
  def apply(
    application: String,
    args: String | js.Array[String],
    channel: Channel,
    destination: String,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ApplicationMoveFailed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMoveFailed]
  }
}

