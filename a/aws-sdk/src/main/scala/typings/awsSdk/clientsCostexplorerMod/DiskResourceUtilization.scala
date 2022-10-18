package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskResourceUtilization extends StObject {
  
  /**
    * The maximum read throughput operations per second. 
    */
  var DiskReadBytesPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The maximum number of read operations per second. 
    */
  var DiskReadOpsPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The maximum write throughput operations per second. 
    */
  var DiskWriteBytesPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The maximum number of write operations per second. 
    */
  var DiskWriteOpsPerSecond: js.UndefOr[GenericString] = js.undefined
}
object DiskResourceUtilization {
  
  inline def apply(): DiskResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskResourceUtilization]
  }
  
  extension [Self <: DiskResourceUtilization](x: Self) {
    
    inline def setDiskReadBytesPerSecond(value: GenericString): Self = StObject.set(x, "DiskReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setDiskReadBytesPerSecondUndefined: Self = StObject.set(x, "DiskReadBytesPerSecond", js.undefined)
    
    inline def setDiskReadOpsPerSecond(value: GenericString): Self = StObject.set(x, "DiskReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setDiskReadOpsPerSecondUndefined: Self = StObject.set(x, "DiskReadOpsPerSecond", js.undefined)
    
    inline def setDiskWriteBytesPerSecond(value: GenericString): Self = StObject.set(x, "DiskWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setDiskWriteBytesPerSecondUndefined: Self = StObject.set(x, "DiskWriteBytesPerSecond", js.undefined)
    
    inline def setDiskWriteOpsPerSecond(value: GenericString): Self = StObject.set(x, "DiskWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setDiskWriteOpsPerSecondUndefined: Self = StObject.set(x, "DiskWriteOpsPerSecond", js.undefined)
  }
}
