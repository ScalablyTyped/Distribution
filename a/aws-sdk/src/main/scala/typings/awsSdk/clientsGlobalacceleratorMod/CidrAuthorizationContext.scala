package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrAuthorizationContext extends StObject {
  
  /**
    * The plain-text authorization message for the prefix and account.
    */
  var Message: GenericString
  
  /**
    * The signed authorization message for the prefix and account.
    */
  var Signature: GenericString
}
object CidrAuthorizationContext {
  
  inline def apply(Message: GenericString, Signature: GenericString): CidrAuthorizationContext = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidrAuthorizationContext]
  }
  
  extension [Self <: CidrAuthorizationContext](x: Self) {
    
    inline def setMessage(value: GenericString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: GenericString): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
  }
}
