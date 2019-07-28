package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutVoiceConnectorOriginationResponse extends js.Object {
  /**
    * The updated origination setting details.
    */
  var Origination: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Origination] = js.undefined
}

object PutVoiceConnectorOriginationResponse {
  @scala.inline
  def apply(Origination: Origination = null): PutVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    if (Origination != null) __obj.updateDynamic("Origination")(Origination)
    __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
  }
}

