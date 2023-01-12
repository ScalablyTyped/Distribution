package typings.aureliaKnockout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var container: typings.aureliaDependencyInjection.mod.Container
    
    def globalResources(resources: String*): Any
  }
  object Container {
    
    inline def apply(
      container: typings.aureliaDependencyInjection.mod.Container,
      globalResources: /* repeated */ String => Any
    ): Container = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: typings.aureliaDependencyInjection.mod.Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setGlobalResources(value: /* repeated */ String => Any): Self = StObject.set(x, "globalResources", js.Any.fromFunction1(value))
    }
  }
}
