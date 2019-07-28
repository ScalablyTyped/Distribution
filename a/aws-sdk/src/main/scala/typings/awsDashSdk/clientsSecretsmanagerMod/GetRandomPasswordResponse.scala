package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRandomPasswordResponse extends js.Object {
  /**
    * A string with the generated password.
    */
  var RandomPassword: js.UndefOr[RandomPasswordType] = js.undefined
}

object GetRandomPasswordResponse {
  @scala.inline
  def apply(RandomPassword: RandomPasswordType = null): GetRandomPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (RandomPassword != null) __obj.updateDynamic("RandomPassword")(RandomPassword)
    __obj.asInstanceOf[GetRandomPasswordResponse]
  }
}

