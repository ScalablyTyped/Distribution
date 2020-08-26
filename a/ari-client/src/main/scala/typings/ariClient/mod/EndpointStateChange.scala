package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointStateChange extends Event {
  /**
    * Endpoint.
    */
  var endpoint: Endpoint = js.native
}

object EndpointStateChange {
  @scala.inline
  def apply(application: String, endpoint: Endpoint, timestamp: Date, `type`: String): EndpointStateChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointStateChange]
  }
  @scala.inline
  implicit class EndpointStateChangeOps[Self <: EndpointStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("endpoint", value.asInstanceOf[js.Any])
  }
  
}

