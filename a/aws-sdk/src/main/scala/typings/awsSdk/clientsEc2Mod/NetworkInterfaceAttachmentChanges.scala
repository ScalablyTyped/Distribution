package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfaceAttachmentChanges extends StObject {
  
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[NetworkInterfaceAttachmentId] = js.undefined
  
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
}
object NetworkInterfaceAttachmentChanges {
  
  inline def apply(): NetworkInterfaceAttachmentChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAttachmentChanges]
  }
  
  extension [Self <: NetworkInterfaceAttachmentChanges](x: Self) {
    
    inline def setAttachmentId(value: NetworkInterfaceAttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
  }
}
