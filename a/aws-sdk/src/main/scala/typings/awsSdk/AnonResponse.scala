package typings.awsSdk

import typings.awsSdk.responseMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResponse[D, E] extends js.Object {
  @JSName("$response")
  var $response: Response[D, E] = js.native
}

object AnonResponse {
  @scala.inline
  def apply[D, E]($response: Response[D, E]): AnonResponse[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResponse[D, E]]
  }
}

