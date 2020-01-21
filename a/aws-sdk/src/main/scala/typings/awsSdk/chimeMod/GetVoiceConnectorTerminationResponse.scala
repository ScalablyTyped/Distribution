package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorTerminationResponse extends js.Object {
  /**
    * The termination setting details.
    */
  var Termination: js.UndefOr[typings.awsSdk.chimeMod.Termination] = js.native
}

object GetVoiceConnectorTerminationResponse {
  @scala.inline
  def apply(Termination: Termination = null): GetVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    if (Termination != null) __obj.updateDynamic("Termination")(Termination.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
  }
}

