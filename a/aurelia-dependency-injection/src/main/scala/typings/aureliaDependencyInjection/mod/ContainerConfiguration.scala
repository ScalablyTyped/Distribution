package typings.aureliaDependencyInjection.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerConfiguration extends StObject {
  
  var handlers: js.UndefOr[Map[Any, Any]] = js.undefined
  
  var onHandlerCreated: js.UndefOr[
    js.Function1[/* handler */ InvocationHandler[Any, Any, Any], InvocationHandler[Any, Any, Any]]
  ] = js.undefined
}
object ContainerConfiguration {
  
  inline def apply(): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setHandlers(value: Map[Any, Any]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setOnHandlerCreated(value: /* handler */ InvocationHandler[Any, Any, Any] => InvocationHandler[Any, Any, Any]): Self = StObject.set(x, "onHandlerCreated", js.Any.fromFunction1(value))
    
    inline def setOnHandlerCreatedUndefined: Self = StObject.set(x, "onHandlerCreated", js.undefined)
  }
}
