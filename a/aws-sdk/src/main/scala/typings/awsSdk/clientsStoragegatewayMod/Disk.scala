package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disk extends StObject {
  
  /**
    * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the local disk is not defined as an iSCSI target. The format of this field is targetIqn::LUNNumber::region-volumeId.
    */
  var DiskAllocationResource: js.UndefOr[String] = js.undefined
  
  var DiskAllocationType: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.DiskAllocationType] = js.undefined
  
  var DiskAttributeList: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.DiskAttributeList] = js.undefined
  
  /**
    * The unique device ID or other distinguishing data that identifies a local disk.
    */
  var DiskId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.DiskId] = js.undefined
  
  /**
    * The device node of a local disk as assigned by the virtualization environment.
    */
  var DiskNode: js.UndefOr[String] = js.undefined
  
  /**
    * The path of a local disk in the gateway virtual machine (VM).
    */
  var DiskPath: js.UndefOr[String] = js.undefined
  
  /**
    * The local disk size in bytes.
    */
  var DiskSizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * A value that represents the status of a local disk.
    */
  var DiskStatus: js.UndefOr[String] = js.undefined
}
object Disk {
  
  inline def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  
  extension [Self <: Disk](x: Self) {
    
    inline def setDiskAllocationResource(value: String): Self = StObject.set(x, "DiskAllocationResource", value.asInstanceOf[js.Any])
    
    inline def setDiskAllocationResourceUndefined: Self = StObject.set(x, "DiskAllocationResource", js.undefined)
    
    inline def setDiskAllocationType(value: DiskAllocationType): Self = StObject.set(x, "DiskAllocationType", value.asInstanceOf[js.Any])
    
    inline def setDiskAllocationTypeUndefined: Self = StObject.set(x, "DiskAllocationType", js.undefined)
    
    inline def setDiskAttributeList(value: DiskAttributeList): Self = StObject.set(x, "DiskAttributeList", value.asInstanceOf[js.Any])
    
    inline def setDiskAttributeListUndefined: Self = StObject.set(x, "DiskAttributeList", js.undefined)
    
    inline def setDiskAttributeListVarargs(value: DiskAttribute*): Self = StObject.set(x, "DiskAttributeList", js.Array(value*))
    
    inline def setDiskId(value: DiskId): Self = StObject.set(x, "DiskId", value.asInstanceOf[js.Any])
    
    inline def setDiskIdUndefined: Self = StObject.set(x, "DiskId", js.undefined)
    
    inline def setDiskNode(value: String): Self = StObject.set(x, "DiskNode", value.asInstanceOf[js.Any])
    
    inline def setDiskNodeUndefined: Self = StObject.set(x, "DiskNode", js.undefined)
    
    inline def setDiskPath(value: String): Self = StObject.set(x, "DiskPath", value.asInstanceOf[js.Any])
    
    inline def setDiskPathUndefined: Self = StObject.set(x, "DiskPath", js.undefined)
    
    inline def setDiskSizeInBytes(value: long): Self = StObject.set(x, "DiskSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeInBytesUndefined: Self = StObject.set(x, "DiskSizeInBytes", js.undefined)
    
    inline def setDiskStatus(value: String): Self = StObject.set(x, "DiskStatus", value.asInstanceOf[js.Any])
    
    inline def setDiskStatusUndefined: Self = StObject.set(x, "DiskStatus", js.undefined)
  }
}
