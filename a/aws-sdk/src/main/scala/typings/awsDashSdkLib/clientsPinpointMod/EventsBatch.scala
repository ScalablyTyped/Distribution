package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsBatch extends js.Object {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  var Endpoint: js.UndefOr[PublicEndpoint] = js.undefined
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  var Events: js.UndefOr[MapOfEvent] = js.undefined
}

object EventsBatch {
  @scala.inline
  def apply(Endpoint: PublicEndpoint = null, Events: MapOfEvent = null): EventsBatch = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (Events != null) __obj.updateDynamic("Events")(Events)
    __obj.asInstanceOf[EventsBatch]
  }
}

