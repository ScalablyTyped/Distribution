package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsInstanceBlockDeviceSpecification extends StObject {
  
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VolumeId] = js.undefined
}
object EbsInstanceBlockDeviceSpecification {
  
  inline def apply(): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
  
  extension [Self <: EbsInstanceBlockDeviceSpecification](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
