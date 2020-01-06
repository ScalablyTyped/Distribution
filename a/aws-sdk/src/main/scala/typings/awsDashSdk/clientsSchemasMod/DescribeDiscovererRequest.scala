package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDiscovererRequest extends js.Object {
  var DiscovererId: __string = js.native
}

object DescribeDiscovererRequest {
  @scala.inline
  def apply(DiscovererId: __string): DescribeDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDiscovererRequest]
  }
}

