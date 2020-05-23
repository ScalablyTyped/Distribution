package typings.anyproxy.mod

import typings.anyproxy.anon.PartialResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSendResponseResult extends js.Object {
  var response: PartialResponse
}

object BeforeSendResponseResult {
  @scala.inline
  def apply(response: PartialResponse): BeforeSendResponseResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSendResponseResult]
  }
}

