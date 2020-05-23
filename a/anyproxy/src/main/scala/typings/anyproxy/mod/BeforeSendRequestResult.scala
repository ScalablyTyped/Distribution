package typings.anyproxy.mod

import typings.anyproxy.anon.PartialResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<anyproxy.anyproxy.RequestDetail> */
trait BeforeSendRequestResult extends js.Object {
  var _req: js.UndefOr[IncomingMessage] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var requestData: js.UndefOr[js.Any] = js.undefined
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  var response: js.UndefOr[PartialResponse] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object BeforeSendRequestResult {
  @scala.inline
  def apply(
    _req: IncomingMessage = null,
    protocol: String = null,
    requestData: js.Any = null,
    requestOptions: RequestOptions = null,
    response: PartialResponse = null,
    url: String = null
  ): BeforeSendRequestResult = {
    val __obj = js.Dynamic.literal()
    if (_req != null) __obj.updateDynamic("_req")(_req.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (requestData != null) __obj.updateDynamic("requestData")(requestData.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSendRequestResult]
  }
}

