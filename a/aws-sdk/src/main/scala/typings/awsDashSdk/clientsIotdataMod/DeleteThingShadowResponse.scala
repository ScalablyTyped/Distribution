package typings.awsDashSdk.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteThingShadowResponse extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: JsonDocument
}

object DeleteThingShadowResponse {
  @scala.inline
  def apply(payload: JsonDocument): DeleteThingShadowResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteThingShadowResponse]
  }
}

