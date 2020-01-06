package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsBatch extends js.Object {
  /**
    * A set of properties and attributes that are associated with the endpoint.
    */
  var Endpoint: PublicEndpoint = js.native
  /**
    * A set of properties that are associated with the event.
    */
  var Events: MapOfEvent = js.native
}

object EventsBatch {
  @scala.inline
  def apply(Endpoint: PublicEndpoint, Events: MapOfEvent): EventsBatch = {
    val __obj = js.Dynamic.literal(Endpoint = Endpoint.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventsBatch]
  }
}

