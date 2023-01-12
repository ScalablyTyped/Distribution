package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolver_ extends StObject {
  
  def get(container: Container, key: Any): Any
}
object Resolver_ {
  
  inline def apply(get: (Container, Any) => Any): Resolver_ = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Resolver_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resolver_] (val x: Self) extends AnyVal {
    
    inline def setGet(value: (Container, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
  }
}
