package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutVoiceConnectorTerminationResponse extends js.Object {
  /**
    * The updated termination setting details.
    */
  var Termination: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Termination] = js.undefined
}

object PutVoiceConnectorTerminationResponse {
  @scala.inline
  def apply(Termination: Termination = null): PutVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    if (Termination != null) __obj.updateDynamic("Termination")(Termination)
    __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
  }
}

