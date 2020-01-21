package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorOriginationResponse extends js.Object {
  /**
    * The updated origination setting details.
    */
  var Origination: js.UndefOr[typings.awsSdk.chimeMod.Origination] = js.native
}

object PutVoiceConnectorOriginationResponse {
  @scala.inline
  def apply(Origination: Origination = null): PutVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    if (Origination != null) __obj.updateDynamic("Origination")(Origination.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
  }
}

