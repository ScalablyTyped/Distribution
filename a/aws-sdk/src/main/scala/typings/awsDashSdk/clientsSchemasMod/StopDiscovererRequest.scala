package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDiscovererRequest extends js.Object {
  var DiscovererId: __string = js.native
}

object StopDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: __string): StopDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopDiscovererRequest]
  }
}

