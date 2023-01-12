package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrAuthorizationContext extends StObject {
  
  /**
    * The plain-text authorization message for the prefix and account.
    */
  var Message: String
  
  /**
    * The signed authorization message for the prefix and account.
    */
  var Signature: String
}
object CidrAuthorizationContext {
  
  inline def apply(Message: String, Signature: String): CidrAuthorizationContext = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidrAuthorizationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CidrAuthorizationContext] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
  }
}
