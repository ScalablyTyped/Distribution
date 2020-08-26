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
  @scala.inline
  implicit class PostToConnectionRequestOps[Self <: PostToConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionId(value: string): Self = this.set("ConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Data): Self = this.set("Data", value.asInstanceOf[js.Any])
  }
  
}

