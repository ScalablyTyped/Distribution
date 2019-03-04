package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Response[D, E] extends js.Object {
  @JSName("$response")
  var $response: awsDashSdkLib.libResponseMod.Response[D, E]
}

object Anon_Response {
  @scala.inline
  def apply[D, E]($response: awsDashSdkLib.libResponseMod.Response[D, E]): Anon_Response[D, E] = {
    val __obj = js.Dynamic.literal($response = $response)
  
    __obj.asInstanceOf[Anon_Response[D, E]]
  }
}

