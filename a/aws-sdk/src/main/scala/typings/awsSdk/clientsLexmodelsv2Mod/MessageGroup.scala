package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageGroup extends StObject {
  
  /**
    * The primary message that Amazon Lex should send to the user.
    */
  var message: Message
  
  /**
    * Message variations to send to the user. When variations are defined, Amazon Lex chooses the primary message or one of the variations to send to the user.
    */
  var variations: js.UndefOr[MessageVariationsList] = js.undefined
}
object MessageGroup {
  
  inline def apply(message: Message): MessageGroup = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageGroup]
  }
  
  extension [Self <: MessageGroup](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setVariations(value: MessageVariationsList): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    inline def setVariationsUndefined: Self = StObject.set(x, "variations", js.undefined)
    
    inline def setVariationsVarargs(value: Message*): Self = StObject.set(x, "variations", js.Array(value*))
  }
}
