package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsFileSystemConfiguration extends js.Object {
  /**
    * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  /**
    * The preferred time to take daily automatic backups, in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  /**
    * The list of maintenance operations in progress for this file system.
    */
  var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.undefined
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.undefined
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined
  /**
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}

object WindowsFileSystemConfiguration {
  @scala.inline
  def apply(
    ActiveDirectoryId: DirectoryId = null,
    AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
    CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
    DailyAutomaticBackupStartTime: DailyTime = null,
    MaintenanceOperationsInProgress: FileSystemMaintenanceOperations = null,
    SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryAttributes = null,
    ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): WindowsFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectoryId != null) __obj.updateDynamic("ActiveDirectoryId")(ActiveDirectoryId)
    if (!js.isUndefined(AutomaticBackupRetentionDays)) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays)
    if (!js.isUndefined(CopyTagsToBackups)) __obj.updateDynamic("CopyTagsToBackups")(CopyTagsToBackups)
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime)
    if (MaintenanceOperationsInProgress != null) __obj.updateDynamic("MaintenanceOperationsInProgress")(MaintenanceOperationsInProgress)
    if (SelfManagedActiveDirectoryConfiguration != null) __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(SelfManagedActiveDirectoryConfiguration)
    if (!js.isUndefined(ThroughputCapacity)) __obj.updateDynamic("ThroughputCapacity")(ThroughputCapacity)
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime)
    __obj.asInstanceOf[WindowsFileSystemConfiguration]
  }
}

