package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegistrationCodeResponse extends js.Object {
  /**
    * The CA certificate registration code.
    */
  var registrationCode: js.UndefOr[RegistrationCode] = js.undefined
}

object GetRegistrationCodeResponse {
  @scala.inline
  def apply(registrationCode: RegistrationCode = null): GetRegistrationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (registrationCode != null) __obj.updateDynamic("registrationCode")(registrationCode)
    __obj.asInstanceOf[GetRegistrationCodeResponse]
  }
}

