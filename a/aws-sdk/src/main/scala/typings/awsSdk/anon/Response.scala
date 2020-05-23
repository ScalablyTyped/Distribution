package typings.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[D, E] extends js.Object {
  @JSName("$response")
  var $response: typings.awsSdk.responseMod.Response[D, E] = js.native
}

object Response {
  @scala.inline
  def apply[D, E]($response: typings.awsSdk.responseMod.Response[D, E]): Response[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[D, E]]
  }
}

