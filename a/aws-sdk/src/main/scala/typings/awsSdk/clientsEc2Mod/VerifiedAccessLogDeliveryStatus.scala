package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogDeliveryStatus extends StObject {
  
  /**
    * The status code.
    */
  var Code: js.UndefOr[VerifiedAccessLogDeliveryStatusCode] = js.undefined
  
  /**
    * The status message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object VerifiedAccessLogDeliveryStatus {
  
  inline def apply(): VerifiedAccessLogDeliveryStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessLogDeliveryStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogDeliveryStatus] (val x: Self) extends AnyVal {
    
    inline def setCode(value: VerifiedAccessLogDeliveryStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
