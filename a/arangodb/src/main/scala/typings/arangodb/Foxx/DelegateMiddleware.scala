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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegateMiddleware] (val x: Self) extends AnyVal {
    
    inline def setRegister(value: Endpoint => SimpleMiddleware): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
