package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDiscovererResponse extends js.Object {
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[__string] = js.native
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
}

object StopDiscovererResponse {
  @scala.inline
  def apply(DiscovererId: __string = null, State: DiscovererState = null): StopDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    if (DiscovererId != null) __obj.updateDynamic("DiscovererId")(DiscovererId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDiscovererResponse]
  }
}

