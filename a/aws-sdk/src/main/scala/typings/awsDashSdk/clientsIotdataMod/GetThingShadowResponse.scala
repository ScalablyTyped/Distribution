package typings.awsDashSdk.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetThingShadowResponse extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: js.UndefOr[JsonDocument] = js.undefined
}

object GetThingShadowResponse {
  @scala.inline
  def apply(payload: JsonDocument = null): GetThingShadowResponse = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThingShadowResponse]
  }
}

