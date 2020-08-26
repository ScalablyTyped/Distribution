package typings.anyproxy.mod

import typings.anyproxy.anon.PartialResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<anyproxy.anyproxy.RequestDetail> */
@js.native
trait BeforeSendRequestResult extends js.Object {
  var _req: js.UndefOr[IncomingMessage] = js.native
  var protocol: js.UndefOr[String] = js.native
  var requestData: js.UndefOr[js.Any] = js.native
  var requestOptions: js.UndefOr[RequestOptions] = js.native
  var response: js.UndefOr[PartialResponse] = js.native
  var url: js.UndefOr[String] = js.native
}

object BeforeSendRequestResult {
  @scala.inline
  def apply(): BeforeSendRequestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeSendRequestResult]
  }
  @scala.inline
  implicit class BeforeSendRequestResultOps[Self <: BeforeSendRequestResult] (val x: Self) extends AnyVal {
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
    def delete_req: Self = this.set("_req", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRequestData(value: js.Any): Self = this.set("requestData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestData: Self = this.set("requestData", js.undefined)
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    @scala.inline
    def setResponse(value: PartialResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

