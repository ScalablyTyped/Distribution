package typings.aureliaDependencyInjection.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerConfiguration extends StObject {
  
  var handlers: js.UndefOr[Map[_, _]] = js.native
  
  var onHandlerCreated: js.UndefOr[
    js.Function1[/* handler */ InvocationHandler[_, _, _], InvocationHandler[_, _, _]]
  ] = js.native
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
    def setHandlers(value: Map[_, _]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    @scala.inline
    def setOnHandlerCreated(value: /* handler */ InvocationHandler[_, _, _] => InvocationHandler[_, _, _]): Self = StObject.set(x, "onHandlerCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerCreatedUndefined: Self = StObject.set(x, "onHandlerCreated", js.undefined)
  }
}
