package typings.awsDashSdk.clientsApigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionRequest extends js.Object {
  var ConnectionId: __string = js.native
}

object GetConnectionRequest {
  @scala.inline
  def apply(ConnectionId: __string): GetConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConnectionRequest]
  }
}

