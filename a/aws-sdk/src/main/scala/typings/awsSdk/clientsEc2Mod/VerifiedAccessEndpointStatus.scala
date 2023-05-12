package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessEndpointStatus extends StObject {
  
  /**
    * The status code of the Verified Access endpoint.
    */
  var Code: js.UndefOr[VerifiedAccessEndpointStatusCode] = js.undefined
  
  /**
    * The status message of the Verified Access endpoint.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object VerifiedAccessEndpointStatus {
  
  inline def apply(): VerifiedAccessEndpointStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessEndpointStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessEndpointStatus] (val x: Self) extends AnyVal {
    
    inline def setCode(value: VerifiedAccessEndpointStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
