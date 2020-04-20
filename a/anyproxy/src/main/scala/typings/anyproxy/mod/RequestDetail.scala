package typings.anyproxy.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDetail extends js.Object {
  var _req: IncomingMessage
  var protocol: String
  var requestData: js.Any
  var requestOptions: RequestOptions
  var url: String
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
}

