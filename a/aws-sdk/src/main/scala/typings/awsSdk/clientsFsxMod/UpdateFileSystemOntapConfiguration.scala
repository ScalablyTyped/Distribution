package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileSystemOntapConfiguration extends StObject {
  
  /**
    * (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your Amazon FSx for NetApp ONTAP file system.
    */
  var AddRouteTableIds: js.UndefOr[RouteTableIds] = js.undefined
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.clientsFsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The configuration consists of an IOPS mode (AUTOMATIC or USER_PROVISIONED), and in the case of USER_PROVISIONED IOPS, the total number of SSD IOPS provisioned.
    */
  var DiskIopsConfiguration: js.UndefOr[typings.awsSdk.clientsFsxMod.DiskIopsConfiguration] = js.undefined
  
  /**
    * The ONTAP administrative password for the fsxadmin user.
    */
  var FsxAdminPassword: js.UndefOr[AdminPassword] = js.undefined
  
  /**
    * (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate (remove) from your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the list of VPC route table IDs for a file system.
    */
  var RemoveRouteTableIds: js.UndefOr[RouteTableIds] = js.undefined
  
  /**
    * Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps). Valid values are 128, 256, 512, 1024, 2048, and 4096 MBps.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined
  
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object UpdateFileSystemOntapConfiguration {
  
  inline def apply(): UpdateFileSystemOntapConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemOntapConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFileSystemOntapConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAddRouteTableIds(value: RouteTableIds): Self = StObject.set(x, "AddRouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setAddRouteTableIdsUndefined: Self = StObject.set(x, "AddRouteTableIds", js.undefined)
    
    inline def setAddRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "AddRouteTableIds", js.Array(value*))
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDiskIopsConfiguration(value: DiskIopsConfiguration): Self = StObject.set(x, "DiskIopsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDiskIopsConfigurationUndefined: Self = StObject.set(x, "DiskIopsConfiguration", js.undefined)
    
    inline def setFsxAdminPassword(value: AdminPassword): Self = StObject.set(x, "FsxAdminPassword", value.asInstanceOf[js.Any])
    
    inline def setFsxAdminPasswordUndefined: Self = StObject.set(x, "FsxAdminPassword", js.undefined)
    
    inline def setRemoveRouteTableIds(value: RouteTableIds): Self = StObject.set(x, "RemoveRouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveRouteTableIdsUndefined: Self = StObject.set(x, "RemoveRouteTableIds", js.undefined)
    
    inline def setRemoveRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "RemoveRouteTableIds", js.Array(value*))
    
    inline def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setThroughputCapacityUndefined: Self = StObject.set(x, "ThroughputCapacity", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
