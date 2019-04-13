package typings
package awsDashSdkLib.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSecretValueResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the secret for which you just created a version.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  /**
    * The friendly name of the secret for which you just created or updated a version.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  /**
    * The unique identifier of the version of the secret you just created or updated.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  /**
    * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}

object PutSecretValueResponse {
  @scala.inline
  def apply(
    ARN: SecretARNType = null,
    Name: SecretNameType = null,
    VersionId: SecretVersionIdType = null,
    VersionStages: SecretVersionStagesType = null
  ): PutSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    if (VersionStages != null) __obj.updateDynamic("VersionStages")(VersionStages)
    __obj.asInstanceOf[PutSecretValueResponse]
  }
}

