package typings.anyproxy.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeDealHttpsRequestDetail extends js.Object {
  var _req: IncomingMessage
  var host: String
}

object BeforeDealHttpsRequestDetail {
  @scala.inline
  def apply(_req: IncomingMessage, host: String): BeforeDealHttpsRequestDetail = {
    val __obj = js.Dynamic.literal(_req = _req.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeforeDealHttpsRequestDetail]
  }
}

