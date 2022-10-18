package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlainTextMessage extends StObject {
  
  /**
    * The message to send to the user.
    */
  var value: PlainTextMessageValue
}
object PlainTextMessage {
  
  inline def apply(value: PlainTextMessageValue): PlainTextMessage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainTextMessage]
  }
  
  extension [Self <: PlainTextMessage](x: Self) {
    
    inline def setValue(value: PlainTextMessageValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
