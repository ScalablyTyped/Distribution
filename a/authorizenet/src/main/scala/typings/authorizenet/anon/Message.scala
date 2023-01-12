package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: js.Array[Code]
  
  var resultCode: String
}
object Message {
  
  inline def apply(message: js.Array[Code], resultCode: String): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: js.Array[Code]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageVarargs(value: Code*): Self = StObject.set(x, "message", js.Array(value*))
    
    inline def setResultCode(value: String): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
  }
}
