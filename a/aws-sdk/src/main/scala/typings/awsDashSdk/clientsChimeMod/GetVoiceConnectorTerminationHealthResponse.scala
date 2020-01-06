package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
  /**
    * The termination health details.
    */
  var TerminationHealth: js.UndefOr[typings.awsDashSdk.clientsChimeMod.TerminationHealth] = js.native
}

object GetVoiceConnectorTerminationHealthResponse {
  @scala.inline
  def apply(TerminationHealth: TerminationHealth = null): GetVoiceConnectorTerminationHealthResponse = {
    val __obj = js.Dynamic.literal()
    if (TerminationHealth != null) __obj.updateDynamic("TerminationHealth")(TerminationHealth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
  }
}

