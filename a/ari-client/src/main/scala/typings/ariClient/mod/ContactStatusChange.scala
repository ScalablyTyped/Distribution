package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactStatusChange extends Event {
  var contact_info: ContactInfo
  /* Properties */
  var endpoint: Endpoint
}

object ContactStatusChange {
  @scala.inline
  def apply(
    application: String,
    contact_info: ContactInfo,
    endpoint: Endpoint,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ContactStatusChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], contact_info = contact_info.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactStatusChange]
  }
}

