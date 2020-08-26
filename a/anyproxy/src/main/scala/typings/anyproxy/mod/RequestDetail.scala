package typings.anyproxy.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDetail extends js.Object {
  var _req: IncomingMessage = js.native
  var protocol: String = js.native
  var requestData: js.Any = js.native
  var requestOptions: RequestOptions = js.native
  var url: String = js.native
}

object RequestDetail {
  @scala.inline
  def apply(
    _req: IncomingMessage,
    protocol: String,
    requestData: js.Any,
    requestOptions: RequestOptions,
    url: String
  ): RequestDetail = {
    val __obj = js.Dynamic.literal(_req = _req.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], requestData = requestData.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetail]
  }
  @scala.inline
  implicit class RequestDetailOps[Self <: RequestDetail] (val x: Self) extends AnyVal {
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
    def set_req(value: IncomingMessage): Self = this.set("_req", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestData(value: js.Any): Self = this.set("requestData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

