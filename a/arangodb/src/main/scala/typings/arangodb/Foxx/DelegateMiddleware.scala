package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegateMiddleware extends StObject {
  
  def register(endpoint: Endpoint): SimpleMiddleware
}
object DelegateMiddleware {
  
  inline def apply(register: Endpoint => SimpleMiddleware): DelegateMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[DelegateMiddleware]
  }
  
  extension [Self <: DelegateMiddleware](x: Self) {
    
    inline def setRegister(value: Endpoint => SimpleMiddleware): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
