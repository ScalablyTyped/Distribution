package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretVersionsListEntry extends js.Object {
  /**
    * The date and time this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[CreatedDateType] = js.undefined
  /**
    * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.
    */
  var LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined
  /**
    * The unique version identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  /**
    * An array of staging labels that are currently associated with this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}

object SecretVersionsListEntry {
  @scala.inline
  def apply(
    CreatedDate: CreatedDateType = null,
    LastAccessedDate: LastAccessedDateType = null,
    VersionId: SecretVersionIdType = null,
    VersionStages: SecretVersionStagesType = null
  ): SecretVersionsListEntry = {
    val __obj = js.Dynamic.literal()
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (LastAccessedDate != null) __obj.updateDynamic("LastAccessedDate")(LastAccessedDate)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    if (VersionStages != null) __obj.updateDynamic("VersionStages")(VersionStages)
    __obj.asInstanceOf[SecretVersionsListEntry]
  }
}

