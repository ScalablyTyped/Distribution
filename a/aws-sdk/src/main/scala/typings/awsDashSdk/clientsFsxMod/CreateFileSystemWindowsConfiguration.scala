package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileSystemWindowsConfiguration extends js.Object {
  /**
    * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when it's created.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsDashSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  /**
    * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  /**
    * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[typings.awsDashSdk.clientsFsxMod.SelfManagedActiveDirectoryConfiguration] = js.undefined
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the nth increments, between 2^3 (8) and 2^11 (2048).
    */
  var ThroughputCapacity: MegabytesPerSecond
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}

object CreateFileSystemWindowsConfiguration {
  @scala.inline
  def apply(
    ThroughputCapacity: MegabytesPerSecond,
    ActiveDirectoryId: DirectoryId = null,
    AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
    CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
    DailyAutomaticBackupStartTime: DailyTime = null,
    SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfiguration = null,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): CreateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal(ThroughputCapacity = ThroughputCapacity)
    if (ActiveDirectoryId != null) __obj.updateDynamic("ActiveDirectoryId")(ActiveDirectoryId)
    if (!js.isUndefined(AutomaticBackupRetentionDays)) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays)
    if (!js.isUndefined(CopyTagsToBackups)) __obj.updateDynamic("CopyTagsToBackups")(CopyTagsToBackups)
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime)
    if (SelfManagedActiveDirectoryConfiguration != null) __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(SelfManagedActiveDirectoryConfiguration)
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime)
    __obj.asInstanceOf[CreateFileSystemWindowsConfiguration]
  }
}

