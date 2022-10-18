package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamCidrAuthorizationContext extends StObject {
  
  /**
    * The plain-text authorization message for the prefix and account.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The signed authorization message for the prefix and account.
    */
  var Signature: js.UndefOr[String] = js.undefined
}
object IpamCidrAuthorizationContext {
  
  inline def apply(): IpamCidrAuthorizationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamCidrAuthorizationContext]
  }
  
  extension [Self <: IpamCidrAuthorizationContext](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
  }
}
