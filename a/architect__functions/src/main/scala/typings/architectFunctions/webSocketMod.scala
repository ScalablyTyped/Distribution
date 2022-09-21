package typings.architectFunctions

import typings.architectFunctions.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketMod {
  
  trait ArcWebSocket extends StObject {
    
    def send(hasIdPayload: Id): js.Promise[Unit]
  }
  object ArcWebSocket {
    
    inline def apply(send: Id => js.Promise[Unit]): ArcWebSocket = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[ArcWebSocket]
    }
    
    extension [Self <: ArcWebSocket](x: Self) {
      
      inline def setSend(value: Id => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
}
