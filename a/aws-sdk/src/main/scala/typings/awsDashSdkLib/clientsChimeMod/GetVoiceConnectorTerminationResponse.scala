package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoiceConnectorTerminationResponse extends js.Object {
  /**
    * The termination setting details.
    */
  var Termination: js.UndefOr[Termination] = js.undefined
}

object GetVoiceConnectorTerminationResponse {
  @scala.inline
  def apply(Termination: Termination = null): GetVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    if (Termination != null) __obj.updateDynamic("Termination")(Termination)
    __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
  }
}

