package typings.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionRequest extends js.Object {
  var ConnectionId: string = js.native
}

object GetConnectionRequest {
  @scala.inline
  def apply(ConnectionId: string): GetConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionRequest]
  }
}

