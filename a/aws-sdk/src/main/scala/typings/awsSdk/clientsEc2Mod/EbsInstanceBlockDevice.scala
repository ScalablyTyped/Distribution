package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsInstanceBlockDevice extends StObject {
  
  /**
    * The time stamp when the attachment initiated.
    */
  var AttachTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.undefined
  
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object EbsInstanceBlockDevice {
  
  inline def apply(): EbsInstanceBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDevice]
  }
  
  extension [Self <: EbsInstanceBlockDevice](x: Self) {
    
    inline def setAttachTime(value: js.Date): Self = StObject.set(x, "AttachTime", value.asInstanceOf[js.Any])
    
    inline def setAttachTimeUndefined: Self = StObject.set(x, "AttachTime", js.undefined)
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setStatus(value: AttachmentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
