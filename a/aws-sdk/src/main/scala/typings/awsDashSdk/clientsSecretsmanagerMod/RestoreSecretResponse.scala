package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreSecretResponse extends js.Object {
  /**
    * The ARN of the secret that was restored.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  /**
    * The friendly name of the secret that was restored.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
}

object RestoreSecretResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, Name: SecretNameType = null): RestoreSecretResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[RestoreSecretResponse]
  }
}

