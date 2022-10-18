package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetails extends StObject {
  
  /**
    * The error code associated with the operation failure.
    */
  var Code: stringType
  
  /**
    * Detailed information about the reason that the operation failed.
    */
  var Message: stringType
}
object ErrorDetails {
  
  inline def apply(Code: stringType, Message: stringType): ErrorDetails = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setCode(value: stringType): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: stringType): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
