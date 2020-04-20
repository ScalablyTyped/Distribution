package typings.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConnectionRequest extends js.Object {
  var ConnectionId: string = js.native
}

object DeleteConnectionRequest {
  @scala.inline
  def apply(ConnectionId: string): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
}

