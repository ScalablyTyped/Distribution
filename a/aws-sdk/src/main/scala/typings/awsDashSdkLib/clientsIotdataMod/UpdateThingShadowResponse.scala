package typings
package awsDashSdkLib.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateThingShadowResponse extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: js.UndefOr[JsonDocument] = js.undefined
}

object UpdateThingShadowResponse {
  @scala.inline
  def apply(payload: JsonDocument = null): UpdateThingShadowResponse = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingShadowResponse]
  }
}

