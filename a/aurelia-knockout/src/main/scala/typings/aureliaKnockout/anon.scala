package typings.aureliaKnockout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Container extends StObject {
    
    var container: typings.aureliaDependencyInjection.mod.Container = js.native
    
    def globalResources(resources: String*): js.Any = js.native
  }
  object Container {
    
    @scala.inline
    def apply(
      container: typings.aureliaDependencyInjection.mod.Container,
      globalResources: /* repeated */ String => js.Any
    ): Container = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: typings.aureliaDependencyInjection.mod.Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalResources(value: /* repeated */ String => js.Any): Self = StObject.set(x, "globalResources", js.Any.fromFunction1(value))
    }
  }
}
