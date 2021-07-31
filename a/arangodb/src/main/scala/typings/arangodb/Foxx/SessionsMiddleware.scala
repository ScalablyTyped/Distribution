package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionsMiddleware
  extends StObject
     with DelegateMiddleware {
  
  var storage: SessionStorage
  
  var transport: js.Array[SessionTransport]
}
object SessionsMiddleware {
  
  @scala.inline
  def apply(
    register: Endpoint => SimpleMiddleware,
    storage: SessionStorage,
    transport: js.Array[SessionTransport]
  ): SessionsMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionsMiddleware]
  }
  
  @scala.inline
  implicit class SessionsMiddlewareMutableBuilder[Self <: SessionsMiddleware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorage(value: SessionStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: js.Array[SessionTransport]): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportVarargs(value: SessionTransport*): Self = StObject.set(x, "transport", js.Array(value :_*))
  }
}
