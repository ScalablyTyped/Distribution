package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemOpenZFSConfiguration extends StObject {
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * A Boolean value indicating whether tags for the file system should be copied to backups. This value defaults to false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  /**
    * A Boolean value indicating whether tags for the file system should be copied to volumes. This value defaults to false. If it's set to true, all tags for the file system are copied to volumes where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to volumes. If you specify one or more tags when creating the volume, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToVolumes: js.UndefOr[Flag] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within a single Availability Zone in an Amazon Web Services Region . Valid values are the following:    SINGLE_AZ_1- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s. Single_AZ_1 is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is available, except US West (Oregon).    SINGLE_AZ_2- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an NVMe L2ARC cache. Single_AZ_2 is available only in the US East (N. Virginia), US East (Ohio), US West (Oregon), and Europe (Ireland) Amazon Web Services Regions.   For more information, see: Deployment type availability and File system performance in the Amazon FSx for OpenZFS User Guide.
    */
  var DeploymentType: OpenZFSDeploymentType
  
  var DiskIopsConfiguration: js.UndefOr[typings.awsSdk.clientsFsxMod.DiskIopsConfiguration] = js.undefined
  
  /**
    * The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system. All volumes are children of the root volume. 
    */
  var RootVolumeConfiguration: js.UndefOr[OpenZFSCreateRootVolumeConfiguration] = js.undefined
  
  /**
    * Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second (MB/s). Valid values depend on the DeploymentType you choose, as follows:   For SINGLE_AZ_1, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.   For SINGLE_AZ_2, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240 MB/s.   You pay for additional throughput capacity that you provision.
    */
  var ThroughputCapacity: MegabytesPerSecond
  
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object CreateFileSystemOpenZFSConfiguration {
  
  inline def apply(DeploymentType: OpenZFSDeploymentType, ThroughputCapacity: MegabytesPerSecond): CreateFileSystemOpenZFSConfiguration = {
    val __obj = js.Dynamic.literal(DeploymentType = DeploymentType.asInstanceOf[js.Any], ThroughputCapacity = ThroughputCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemOpenZFSConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFileSystemOpenZFSConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setCopyTagsToVolumes(value: Flag): Self = StObject.set(x, "CopyTagsToVolumes", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToVolumesUndefined: Self = StObject.set(x, "CopyTagsToVolumes", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDeploymentType(value: OpenZFSDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDiskIopsConfiguration(value: DiskIopsConfiguration): Self = StObject.set(x, "DiskIopsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDiskIopsConfigurationUndefined: Self = StObject.set(x, "DiskIopsConfiguration", js.undefined)
    
    inline def setRootVolumeConfiguration(value: OpenZFSCreateRootVolumeConfiguration): Self = StObject.set(x, "RootVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeConfigurationUndefined: Self = StObject.set(x, "RootVolumeConfiguration", js.undefined)
    
    inline def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
