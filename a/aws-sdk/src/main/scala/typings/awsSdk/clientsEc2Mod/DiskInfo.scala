package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskInfo extends StObject {
  
  /**
    * The number of disks with this configuration.
    */
  var Count: js.UndefOr[DiskCount] = js.undefined
  
  /**
    * The size of the disk in GB.
    */
  var SizeInGB: js.UndefOr[DiskSize] = js.undefined
  
  /**
    * The type of disk.
    */
  var Type: js.UndefOr[DiskType] = js.undefined
}
object DiskInfo {
  
  inline def apply(): DiskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskInfo]
  }
  
  extension [Self <: DiskInfo](x: Self) {
    
    inline def setCount(value: DiskCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setSizeInGB(value: DiskSize): Self = StObject.set(x, "SizeInGB", value.asInstanceOf[js.Any])
    
    inline def setSizeInGBUndefined: Self = StObject.set(x, "SizeInGB", js.undefined)
    
    inline def setType(value: DiskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
