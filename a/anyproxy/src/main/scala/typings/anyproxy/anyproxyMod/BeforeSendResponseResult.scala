package typings.anyproxy.anyproxyMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSendResponseResult extends js.Object {
  var response: Partial[Response]
}

object BeforeSendResponseResult {
  @scala.inline
  def apply(response: Partial[Response]): BeforeSendResponseResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeforeSendResponseResult]
  }
}

