package typings.aureliaDependencyInjection.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerConfiguration extends StObject {
  
  var handlers: js.UndefOr[Map[js.Any, js.Any]] = js.undefined
  
  var onHandlerCreated: js.UndefOr[
    js.Function1[
      /* handler */ InvocationHandler[js.Any, js.Any, js.Any], 
      InvocationHandler[js.Any, js.Any, js.Any]
    ]
  ] = js.undefined
}
object ContainerConfiguration {
  
  @scala.inline
  def apply(): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerConfiguration]
  }
  
  @scala.inline
  implicit class ContainerConfigurationMutableBuilder[Self <: ContainerConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandlers(value: Map[js.Any, js.Any]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    @scala.inline
    def setOnHandlerCreated(
      value: /* handler */ InvocationHandler[js.Any, js.Any, js.Any] => InvocationHandler[js.Any, js.Any, js.Any]
    ): Self = StObject.set(x, "onHandlerCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerCreatedUndefined: Self = StObject.set(x, "onHandlerCreated", js.undefined)
  }
}
