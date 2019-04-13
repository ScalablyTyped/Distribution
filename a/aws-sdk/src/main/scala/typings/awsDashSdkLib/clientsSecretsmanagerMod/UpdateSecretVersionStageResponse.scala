package typings
package awsDashSdkLib.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSecretVersionStageResponse extends js.Object {
  /**
    * The ARN of the secret with the staging label that was modified.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  /**
    * The friendly name of the secret with the staging label that was modified.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
}

object UpdateSecretVersionStageResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, Name: SecretNameType = null): UpdateSecretVersionStageResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateSecretVersionStageResponse]
  }
}

