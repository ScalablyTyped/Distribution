package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorOriginationResponse extends js.Object {
  /**
    * The origination setting details.
    */
  var Origination: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Origination] = js.native
}

object GetVoiceConnectorOriginationResponse {
  @scala.inline
  def apply(Origination: Origination = null): GetVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    if (Origination != null) __obj.updateDynamic("Origination")(Origination.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
  }
}

