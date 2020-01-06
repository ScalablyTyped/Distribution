package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRandomPasswordResponse extends js.Object {
  /**
    * A string with the generated password.
    */
  var RandomPassword: js.UndefOr[RandomPasswordType] = js.native
}

object GetRandomPasswordResponse {
  @scala.inline
  def apply(RandomPassword: RandomPasswordType = null): GetRandomPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (RandomPassword != null) __obj.updateDynamic("RandomPassword")(RandomPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRandomPasswordResponse]
  }
}

