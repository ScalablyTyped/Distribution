package typings.architectFunctions

import typings.architectFunctions.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketMod {
  
  trait ArcWebSocket extends StObject {
    
    def send(param0: Id): js.Promise[Unit]
  }
  object ArcWebSocket {
    
    inline def apply(send: Id => js.Promise[Unit]): ArcWebSocket = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[ArcWebSocket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArcWebSocket] (val x: Self) extends AnyVal {
      
      inline def setSend(value: Id => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
}
