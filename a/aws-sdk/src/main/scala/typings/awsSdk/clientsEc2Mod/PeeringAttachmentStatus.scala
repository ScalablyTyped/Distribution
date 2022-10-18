package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeeringAttachmentStatus extends StObject {
  
  /**
    * The status code.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The status message, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object PeeringAttachmentStatus {
  
  inline def apply(): PeeringAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringAttachmentStatus]
  }
  
  extension [Self <: PeeringAttachmentStatus](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
