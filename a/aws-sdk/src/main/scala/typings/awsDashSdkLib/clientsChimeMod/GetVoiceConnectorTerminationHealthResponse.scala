package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
  /**
    * The termination health details.
    */
  var TerminationHealth: js.UndefOr[TerminationHealth] = js.undefined
}

object GetVoiceConnectorTerminationHealthResponse {
  @scala.inline
  def apply(TerminationHealth: TerminationHealth = null): GetVoiceConnectorTerminationHealthResponse = {
    val __obj = js.Dynamic.literal()
    if (TerminationHealth != null) __obj.updateDynamic("TerminationHealth")(TerminationHealth)
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
  }
}

