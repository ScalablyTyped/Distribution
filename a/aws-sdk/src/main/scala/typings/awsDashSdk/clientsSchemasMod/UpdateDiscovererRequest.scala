package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDiscovererRequest extends js.Object {
  /**
    * The description of the discoverer to update.
    */
  var Description: js.UndefOr[__stringMin0Max256] = js.native
  var DiscovererId: __string = js.native
}

object UpdateDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: __string, Description: __stringMin0Max256 = null): UpdateDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDiscovererRequest]
  }
}

