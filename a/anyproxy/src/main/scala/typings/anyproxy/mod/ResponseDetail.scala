package typings.anyproxy.mod

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseDetail extends js.Object {
  var _res: ServerResponse
  var response: Response
}

object ResponseDetail {
  @scala.inline
  def apply(_res: ServerResponse, response: Response): ResponseDetail = {
    val __obj = js.Dynamic.literal(_res = _res.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDetail]
  }
}

