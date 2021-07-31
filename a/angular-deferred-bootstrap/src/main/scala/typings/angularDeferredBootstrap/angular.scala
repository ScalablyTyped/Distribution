package typings.angularDeferredBootstrap

import typings.angular.mod.IPromise
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  trait IConfigParam extends StObject {
    
    var element: js.UndefOr[Node] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var resolve: js.Any
  }
  object IConfigParam {
    
    @scala.inline
    def apply(resolve: js.Any): IConfigParam = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfigParam]
    }
    
    @scala.inline
    implicit class IConfigParamMutableBuilder[Self <: IConfigParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setResolve(value: js.Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDeferredBootstrapperStatic extends StObject {
    
    def bootstrap(configParam: IConfigParam): IPromise[Boolean]
  }
  object IDeferredBootstrapperStatic {
    
    @scala.inline
    def apply(bootstrap: IConfigParam => IPromise[Boolean]): IDeferredBootstrapperStatic = {
      val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap))
      __obj.asInstanceOf[IDeferredBootstrapperStatic]
    }
    
    @scala.inline
    implicit class IDeferredBootstrapperStaticMutableBuilder[Self <: IDeferredBootstrapperStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrap(value: IConfigParam => IPromise[Boolean]): Self = StObject.set(x, "bootstrap", js.Any.fromFunction1(value))
    }
  }
}
