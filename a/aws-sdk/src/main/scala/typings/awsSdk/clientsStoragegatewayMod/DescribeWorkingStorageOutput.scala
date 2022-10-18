package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkingStorageOutput extends StObject {
  
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.DiskIds] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The total working storage in bytes allocated for the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageUsedInBytes: js.UndefOr[long] = js.undefined
}
object DescribeWorkingStorageOutput {
  
  inline def apply(): DescribeWorkingStorageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkingStorageOutput]
  }
  
  extension [Self <: DescribeWorkingStorageOutput](x: Self) {
    
    inline def setDiskIds(value: DiskIds): Self = StObject.set(x, "DiskIds", value.asInstanceOf[js.Any])
    
    inline def setDiskIdsUndefined: Self = StObject.set(x, "DiskIds", js.undefined)
    
    inline def setDiskIdsVarargs(value: DiskId*): Self = StObject.set(x, "DiskIds", js.Array(value*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setWorkingStorageAllocatedInBytes(value: long): Self = StObject.set(x, "WorkingStorageAllocatedInBytes", value.asInstanceOf[js.Any])
    
    inline def setWorkingStorageAllocatedInBytesUndefined: Self = StObject.set(x, "WorkingStorageAllocatedInBytes", js.undefined)
    
    inline def setWorkingStorageUsedInBytes(value: long): Self = StObject.set(x, "WorkingStorageUsedInBytes", value.asInstanceOf[js.Any])
    
    inline def setWorkingStorageUsedInBytesUndefined: Self = StObject.set(x, "WorkingStorageUsedInBytes", js.undefined)
  }
}
