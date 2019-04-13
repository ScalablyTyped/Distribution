package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVoiceConnectorOriginationResponse extends js.Object {
  /**
    * The origination setting details.
    */
  var Origination: js.UndefOr[Origination] = js.undefined
}

object GetVoiceConnectorOriginationResponse {
  @scala.inline
  def apply(Origination: Origination = null): GetVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    if (Origination != null) __obj.updateDynamic("Origination")(Origination)
    __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
  }
}

