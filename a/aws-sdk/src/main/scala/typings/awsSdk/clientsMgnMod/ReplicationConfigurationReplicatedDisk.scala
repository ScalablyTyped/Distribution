package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfigurationReplicatedDisk extends StObject {
  
  /**
    * Replication Configuration replicated disk device name.
    */
  var deviceName: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Replication Configuration replicated disk IOPs.
    */
  var iops: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Replication Configuration replicated disk boot disk.
    */
  var isBootDisk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Replication Configuration replicated disk staging disk type.
    */
  var stagingDiskType: js.UndefOr[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.undefined
  
  /**
    * Replication Configuration replicated disk throughput.
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
    
    inline def setStagingDiskType(value: ReplicationConfigurationReplicatedDiskStagingDiskType): Self = StObject.set(x, "stagingDiskType", value.asInstanceOf[js.Any])
    
    inline def setStagingDiskTypeUndefined: Self = StObject.set(x, "stagingDiskType", js.undefined)
    
    inline def setThroughput(value: PositiveInteger): Self = StObject.set(x, "throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "throughput", js.undefined)
  }
}
