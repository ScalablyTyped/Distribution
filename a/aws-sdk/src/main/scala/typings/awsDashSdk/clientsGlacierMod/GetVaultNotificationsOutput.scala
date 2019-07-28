package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVaultNotificationsOutput extends js.Object {
  /**
    * Returns the notification configuration set on the vault.
    */
  var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
}

object GetVaultNotificationsOutput {
  @scala.inline
  def apply(vaultNotificationConfig: VaultNotificationConfig = null): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    if (vaultNotificationConfig != null) __obj.updateDynamic("vaultNotificationConfig")(vaultNotificationConfig)
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
}

