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
  @scala.inline
  implicit class GetConnectionRequestOps[Self <: GetConnectionRequest] (val x: Self) extends AnyVal {
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
  }
  
}

