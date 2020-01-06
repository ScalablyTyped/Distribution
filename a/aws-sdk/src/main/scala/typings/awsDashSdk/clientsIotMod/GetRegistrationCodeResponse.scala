package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegistrationCodeResponse extends js.Object {
  /**
    * The CA certificate registration code.
    */
  var registrationCode: js.UndefOr[RegistrationCode] = js.native
}

object GetRegistrationCodeResponse {
  @scala.inline
  def apply(registrationCode: RegistrationCode = null): GetRegistrationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (registrationCode != null) __obj.updateDynamic("registrationCode")(registrationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegistrationCodeResponse]
  }
}

