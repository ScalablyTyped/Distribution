package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LustreFileSystemConfiguration extends StObject {
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value. (Default = false)
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * The data compression configuration for the file system. DataCompressionType can have the following values:    NONE - Data compression is turned off for the file system.    LZ4 - Data compression is turned on with the LZ4 algorithm.   For more information, see Lustre data compression.
    */
  var DataCompressionType: js.UndefOr[typings.awsSdk.clientsFsxMod.DataCompressionType] = js.undefined
  
  var DataRepositoryConfiguration: js.UndefOr[typings.awsSdk.clientsFsxMod.DataRepositoryConfiguration] = js.undefined
  
  /**
    * The deployment type of the FSx for Lustre file system. Scratch deployment type is designed for temporary storage and shorter-term processing of data.  SCRATCH_1 and SCRATCH_2 deployment types are best suited for when you need temporary storage and shorter-term processing of data. The SCRATCH_2 deployment type provides in-transit encryption of data and higher burst throughput capacity than SCRATCH_1. The PERSISTENT_1 and PERSISTENT_2 deployment type is used for longer-term storage and workloads and encryption of data in transit. PERSISTENT_2 is built on Lustre v2.12 and offers higher PerUnitStorageThroughput (up to 1000 MB/s/TiB) along with a lower minimum storage capacity requirement (600 GiB). To learn more about FSx for Lustre deployment types, see  FSx for Lustre deployment options. The default is SCRATCH_1.
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.undefined
  
  /**
    * The type of drive cache used by PERSISTENT_1 file systems that are provisioned with HDD storage devices. This parameter is required when StorageType is HDD. When set to READ the file system has an SSD storage cache that is sized to 20% of the file system's storage capacity. This improves the performance for frequently accessed files by caching up to 20% of the total storage capacity. This parameter is required when StorageType is set to HDD.
    */
  var DriveCacheType: js.UndefOr[typings.awsSdk.clientsFsxMod.DriveCacheType] = js.undefined
  
  /**
    * The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to Amazon CloudWatch Logs.
    */
  var LogConfiguration: js.UndefOr[LustreLogConfiguration] = js.undefined
  
  /**
    * You use the MountName value when mounting the file system. For the SCRATCH_1 deployment type, this value is always "fsx". For SCRATCH_2, PERSISTENT_1, and PERSISTENT_2 deployment types, this value is a string that is unique within an Amazon Web Services Region. 
    */
  var MountName: js.UndefOr[LustreFileSystemMountName] = js.undefined
  
  /**
    * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for PERSISTENT_1 and PERSISTENT_2 deployment types.  Valid values:   For PERSISTENT_1 SSD storage: 50, 100, 200.   For PERSISTENT_1 HDD storage: 12, 40.   For PERSISTENT_2 SSD storage: 125, 250, 500, 1000.  
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.clientsFsxMod.PerUnitStorageThroughput] = js.undefined
  
  /**
    * The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash restricts root-level access from clients that try to access your file system as a root user.
    */
  var RootSquashConfiguration: js.UndefOr[LustreRootSquashConfiguration] = js.undefined
  
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here, d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object LustreFileSystemConfiguration {
  
  inline def apply(): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
  
  extension [Self <: LustreFileSystemConfiguration](x: Self) {
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDataCompressionType(value: DataCompressionType): Self = StObject.set(x, "DataCompressionType", value.asInstanceOf[js.Any])
    
    inline def setDataCompressionTypeUndefined: Self = StObject.set(x, "DataCompressionType", js.undefined)
    
    inline def setDataRepositoryConfiguration(value: DataRepositoryConfiguration): Self = StObject.set(x, "DataRepositoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataRepositoryConfigurationUndefined: Self = StObject.set(x, "DataRepositoryConfiguration", js.undefined)
    
    inline def setDeploymentType(value: LustreDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setDriveCacheType(value: DriveCacheType): Self = StObject.set(x, "DriveCacheType", value.asInstanceOf[js.Any])
    
    inline def setDriveCacheTypeUndefined: Self = StObject.set(x, "DriveCacheType", js.undefined)
    
    inline def setLogConfiguration(value: LustreLogConfiguration): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "LogConfiguration", js.undefined)
    
    inline def setMountName(value: LustreFileSystemMountName): Self = StObject.set(x, "MountName", value.asInstanceOf[js.Any])
    
    inline def setMountNameUndefined: Self = StObject.set(x, "MountName", js.undefined)
    
    inline def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = StObject.set(x, "PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setPerUnitStorageThroughputUndefined: Self = StObject.set(x, "PerUnitStorageThroughput", js.undefined)
    
    inline def setRootSquashConfiguration(value: LustreRootSquashConfiguration): Self = StObject.set(x, "RootSquashConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRootSquashConfigurationUndefined: Self = StObject.set(x, "RootSquashConfiguration", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
