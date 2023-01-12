package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfigurationReplicatedDisk extends StObject {
  
  /**
    * The name of the device.
    */
  var deviceName: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * The requested number of I/O operations per second (IOPS).
    */
  var iops: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Whether to boot from this disk or not.
    */
  var isBootDisk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Staging Disk EBS volume type to be used during replication when stagingDiskType is set to Auto. This is a read-only field.
    */
  var optimizedStagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.undefined
  
  /**
    * The Staging Disk EBS volume type to be used during replication.
    */
  var stagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.undefined
  
  /**
    * The throughput to use for the EBS volume in MiB/s. This parameter is valid only for gp3 volumes.
    */
  var throughput: js.UndefOr[PositiveInteger] = js.undefined
}
object ReplicationConfigurationReplicatedDisk {
  
  inline def apply(): ReplicationConfigurationReplicatedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationConfigurationReplicatedDisk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationConfigurationReplicatedDisk] (val x: Self) extends AnyVal {
    
    inline def setDeviceName(value: BoundedString): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setIops(value: PositiveInteger): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setIsBootDisk(value: Boolean): Self = StObject.set(x, "isBootDisk", value.asInstanceOf[js.Any])
    
    inline def setIsBootDiskUndefined: Self = StObject.set(x, "isBootDisk", js.undefined)
    
    inline def setOptimizedStagingDiskType(value: ReplicationConfigurationReplicatedDiskStagingDiskType): Self = StObject.set(x, "optimizedStagingDiskType", value.asInstanceOf[js.Any])
    
    inline def setOptimizedStagingDiskTypeUndefined: Self = StObject.set(x, "optimizedStagingDiskType", js.undefined)
    
    inline def setStagingDiskType(value: ReplicationConfigurationReplicatedDiskStagingDiskType): Self = StObject.set(x, "stagingDiskType", value.asInstanceOf[js.Any])
    
    inline def setStagingDiskTypeUndefined: Self = StObject.set(x, "stagingDiskType", js.undefined)
    
    inline def setThroughput(value: PositiveInteger): Self = StObject.set(x, "throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "throughput", js.undefined)
  }
}
