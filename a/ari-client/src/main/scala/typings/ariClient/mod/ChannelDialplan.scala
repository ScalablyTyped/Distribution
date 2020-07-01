package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelDialplan extends Event {
  /**
    * The channel that changed dialplan location.
    */
  var channel: Channel
  /**
    * The application about to be executed.
    */
  var dialplan_app: String
  /**
    * The data to be passed to the application.
    */
  var dialplan_app_data: String
}

object ChannelDialplan {
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    dialplan_app: String,
    dialplan_app_data: String,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ChannelDialplan = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dialplan_app = dialplan_app.asInstanceOf[js.Any], dialplan_app_data = dialplan_app_data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDialplan]
  }
}

