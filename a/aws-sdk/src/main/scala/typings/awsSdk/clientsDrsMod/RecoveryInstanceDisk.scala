package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceDisk extends StObject {
  
  /**
    * The amount of storage on the disk in bytes.
    */
  var bytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The EBS Volume ID of this disk.
    */
  var ebsVolumeID: js.UndefOr[EbsVolumeID] = js.undefined
  
  /**
    * The internal device name of this disk. This is the name that is visible on the machine itself and not from the EC2 console.
    */
  var internalDeviceName: js.UndefOr[BoundedString] = js.undefined
}
object RecoveryInstanceDisk {
  
  inline def apply(): RecoveryInstanceDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceDisk]
  }
  
  extension [Self <: RecoveryInstanceDisk](x: Self) {
    
    inline def setBytes(value: PositiveInteger): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setEbsVolumeID(value: EbsVolumeID): Self = StObject.set(x, "ebsVolumeID", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumeIDUndefined: Self = StObject.set(x, "ebsVolumeID", js.undefined)
    
    inline def setInternalDeviceName(value: BoundedString): Self = StObject.set(x, "internalDeviceName", value.asInstanceOf[js.Any])
    
    inline def setInternalDeviceNameUndefined: Self = StObject.set(x, "internalDeviceName", js.undefined)
  }
}
