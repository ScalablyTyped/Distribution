package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupRequest extends js.Object {
  /**
    * The ID of the backup you want to delete.
    */
  var BackupId: awsDashSdkLib.clientsFsxMod.BackupId
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is automatically filled on your behalf when using the AWS CLI or SDK.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
}

object DeleteBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId, ClientRequestToken: ClientRequestToken = null): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    __obj.asInstanceOf[DeleteBackupRequest]
  }
}

