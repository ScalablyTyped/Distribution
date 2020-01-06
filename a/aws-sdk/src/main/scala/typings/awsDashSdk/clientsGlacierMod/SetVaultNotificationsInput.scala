package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVaultNotificationsInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
  /**
    * Provides options for specifying notification configuration.
    */
  var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.native
}

object SetVaultNotificationsInput {
  @scala.inline
  def apply(accountId: String, vaultName: String, vaultNotificationConfig: VaultNotificationConfig = null): SetVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (vaultNotificationConfig != null) __obj.updateDynamic("vaultNotificationConfig")(vaultNotificationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVaultNotificationsInput]
  }
}

