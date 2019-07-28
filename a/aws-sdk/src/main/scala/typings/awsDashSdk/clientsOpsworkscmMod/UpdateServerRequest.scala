package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServerRequest extends js.Object {
  /**
    * Sets the number of automated backups that you want to keep. 
    */
  var BackupRetentionCount: js.UndefOr[Integer] = js.undefined
  /**
    * Setting DisableAutomatedBackup to true disables automated or scheduled backups. Automated backups are enabled by default. 
    */
  var DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
  /**
    * The name of the server to update. 
    */
  var ServerName: typings.awsDashSdk.clientsOpsworkscmMod.ServerName
}

object UpdateServerRequest {
  @scala.inline
  def apply(
    ServerName: ServerName,
    BackupRetentionCount: js.UndefOr[Integer] = js.undefined,
    DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined,
    PreferredBackupWindow: TimeWindowDefinition = null,
    PreferredMaintenanceWindow: TimeWindowDefinition = null
  ): UpdateServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName)
    if (!js.isUndefined(BackupRetentionCount)) __obj.updateDynamic("BackupRetentionCount")(BackupRetentionCount)
    if (!js.isUndefined(DisableAutomatedBackup)) __obj.updateDynamic("DisableAutomatedBackup")(DisableAutomatedBackup)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    __obj.asInstanceOf[UpdateServerRequest]
  }
}

