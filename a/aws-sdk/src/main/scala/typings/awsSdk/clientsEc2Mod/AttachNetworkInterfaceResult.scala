package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachNetworkInterfaceResult extends StObject {
  
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The index of the network card.
    */
  var NetworkCardIndex: js.UndefOr[Integer] = js.undefined
}
object AttachNetworkInterfaceResult {
  
  inline def apply(): AttachNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachNetworkInterfaceResult]
  }
  
  extension [Self <: AttachNetworkInterfaceResult](x: Self) {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setNetworkCardIndex(value: Integer): Self = StObject.set(x, "NetworkCardIndex", value.asInstanceOf[js.Any])
    
    inline def setNetworkCardIndexUndefined: Self = StObject.set(x, "NetworkCardIndex", js.undefined)
  }
}
