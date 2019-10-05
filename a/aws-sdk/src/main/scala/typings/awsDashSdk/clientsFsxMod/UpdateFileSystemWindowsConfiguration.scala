package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFileSystemWindowsConfiguration extends js.Object {
  /**
    * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsDashSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  /**
    * The preferred time to take daily automatic backups, in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  /**
    * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD directory.
    */
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.undefined
  /**
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}

object UpdateFileSystemWindowsConfiguration {
  @scala.inline
  def apply(
    AutomaticBackupRetentionDays: Int | Double = null,
    DailyAutomaticBackupStartTime: DailyTime = null,
    SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationUpdates = null,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): UpdateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AutomaticBackupRetentionDays != null) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays.asInstanceOf[js.Any])
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime)
    if (SelfManagedActiveDirectoryConfiguration != null) __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(SelfManagedActiveDirectoryConfiguration)
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime)
    __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
  }
}

