package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Methods extends StObject {
  
  var methods: js.Array[Any]
}
object Methods {
  
  inline def apply(methods: js.Array[Any]): Methods = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Methods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
    
    inline def setMethods(value: js.Array[Any]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: Any*): Self = StObject.set(x, "methods", js.Array(value*))
  }
}
