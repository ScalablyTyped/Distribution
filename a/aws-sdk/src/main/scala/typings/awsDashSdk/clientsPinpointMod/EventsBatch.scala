package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsBatch extends js.Object {
  /**
    * A set of properties and attributes that are associated with the endpoint.
    */
  var Endpoint: PublicEndpoint
  /**
    * A set of properties that are associated with the event.
    */
  var Events: MapOfEvent
}

object EventsBatch {
  @scala.inline
  def apply(Endpoint: PublicEndpoint, Events: MapOfEvent): EventsBatch = {
    val __obj = js.Dynamic.literal(Endpoint = Endpoint, Events = Events)
  
    __obj.asInstanceOf[EventsBatch]
  }
}

