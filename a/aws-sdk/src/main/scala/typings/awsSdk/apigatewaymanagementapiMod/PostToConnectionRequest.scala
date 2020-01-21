package typings.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostToConnectionRequest extends js.Object {
  /**
    * The identifier of the connection that a specific client is using.
    */
  var ConnectionId: string = js.native
  /**
    * The data to be sent to the client specified by its connection id.
    */
  var Data: typings.awsSdk.apigatewaymanagementapiMod.Data = js.native
}

object PostToConnectionRequest {
  @scala.inline
  def apply(ConnectionId: string, Data: Data): PostToConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostToConnectionRequest]
  }
}

