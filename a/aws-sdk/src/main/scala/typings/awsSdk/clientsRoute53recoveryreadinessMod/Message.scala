package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The text of a readiness check message.
    */
  var MessageText: js.UndefOr[string] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessageText(value: string): Self = StObject.set(x, "MessageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "MessageText", js.undefined)
  }
}
