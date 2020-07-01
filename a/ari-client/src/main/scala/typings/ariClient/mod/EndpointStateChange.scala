package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointStateChange extends Event {
  /**
    * Endpoint.
    */
  var endpoint: Endpoint
}

object EndpointStateChange {
  @scala.inline
  def apply(
    application: String,
    endpoint: Endpoint,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): EndpointStateChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointStateChange]
  }
}

