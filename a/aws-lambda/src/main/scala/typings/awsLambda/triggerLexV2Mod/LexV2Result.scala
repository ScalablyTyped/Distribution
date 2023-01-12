package typings.awsLambda.triggerLexV2Mod

import typings.awsLambda.anon.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2Result extends StObject {
  
  var messages: js.UndefOr[js.Array[LexV2Message]] = js.undefined
  
  var sessionState: Intent
}
object LexV2Result {
  
  inline def apply(sessionState: Intent): LexV2Result = {
    val __obj = js.Dynamic.literal(sessionState = sessionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexV2Result] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[LexV2Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: LexV2Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setSessionState(value: Intent): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
  }
}
