package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDiscovererRequest extends js.Object {
  var DiscovererId: __string = js.native
}

object StartDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: __string): StartDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartDiscovererRequest]
  }
}

