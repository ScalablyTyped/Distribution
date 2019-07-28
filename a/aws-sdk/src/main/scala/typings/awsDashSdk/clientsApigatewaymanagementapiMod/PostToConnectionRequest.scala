package typings.awsDashSdk.clientsApigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostToConnectionRequest extends js.Object {
  /**
    * The identifier of the connection that a specific client is using.
    */
  var ConnectionId: __string
  /**
    * The data to be sent to the client specified by its connection id.
    */
  var Data: typings.awsDashSdk.clientsApigatewaymanagementapiMod.Data
}

object PostToConnectionRequest {
  @scala.inline
  def apply(ConnectionId: __string, Data: Data): PostToConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId, Data = Data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostToConnectionRequest]
  }
}

