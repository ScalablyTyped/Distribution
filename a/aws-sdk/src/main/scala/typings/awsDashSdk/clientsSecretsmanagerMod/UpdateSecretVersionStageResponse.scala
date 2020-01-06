package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSecretVersionStageResponse extends js.Object {
  /**
    * The ARN of the secret with the staging label that was modified.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret with the staging label that was modified.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
}

object UpdateSecretVersionStageResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, Name: SecretNameType = null): UpdateSecretVersionStageResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecretVersionStageResponse]
  }
}

