package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenZFSFileSystemConfiguration extends StObject {
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value. 
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  /**
    * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to false. If it's set to true, all tags for the volume are copied to snapshots where the user doesn't specify tags. If this value is true and you specify one or more tags, only the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are copied from the volume, regardless of this value. 
    */
  var CopyTagsToVolumes: js.UndefOr[Flag] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Specifies the file-system deployment type. Amazon FSx for OpenZFS supports SINGLE_AZ_1. SINGLE_AZ_1 is a file system configured for a single Availability Zone (AZ) of redundancy. 
    */
  var DeploymentType: js.UndefOr[OpenZFSDeploymentType] = js.undefined
  
  var DiskIopsConfiguration: js.UndefOr[typings.awsSdk.clientsFsxMod.DiskIopsConfiguration] = js.undefined
  
  /**
    * The ID of the root volume of the OpenZFS file system. 
    */
  var RootVolumeId: js.UndefOr[VolumeId] = js.undefined
  
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second (MBps). Valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined
  
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object OpenZFSFileSystemConfiguration {
  
  inline def apply(): OpenZFSFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenZFSFileSystemConfiguration]
  }
  
  extension [Self <: OpenZFSFileSystemConfiguration](x: Self) {
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setCopyTagsToVolumes(value: Flag): Self = StObject.set(x, "CopyTagsToVolumes", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToVolumesUndefined: Self = StObject.set(x, "CopyTagsToVolumes", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDeploymentType(value: OpenZFSDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setDiskIopsConfiguration(value: DiskIopsConfiguration): Self = StObject.set(x, "DiskIopsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDiskIopsConfigurationUndefined: Self = StObject.set(x, "DiskIopsConfiguration", js.undefined)
    
    inline def setRootVolumeId(value: VolumeId): Self = StObject.set(x, "RootVolumeId", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeIdUndefined: Self = StObject.set(x, "RootVolumeId", js.undefined)
    
    inline def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setThroughputCapacityUndefined: Self = StObject.set(x, "ThroughputCapacity", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
