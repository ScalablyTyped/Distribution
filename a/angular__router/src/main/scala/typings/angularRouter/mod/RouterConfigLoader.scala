package typings.angularRouter.mod

import typings.angularCore.mod.Injector
import typings.angularCore.mod.Type
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterConfigLoader extends StObject {
  
  /* private */ var childrenLoaders: Any
  
  /* private */ val compiler: Any
  
  /* private */ var componentLoaders: Any
  
  def loadChildren(parentInjector: Injector, route: Route): Observable_[LoadedRouterConfig]
  
  def loadComponent(route: Route): Observable_[Type[Any]]
  
  /* private */ var loadModuleFactoryOrRoutes: Any
  
  var onLoadEndListener: js.UndefOr[js.Function1[/* r */ Route, Unit]] = js.undefined
  
  var onLoadStartListener: js.UndefOr[js.Function1[/* r */ Route, Unit]] = js.undefined
}
object RouterConfigLoader {
  
  inline def apply(
    childrenLoaders: Any,
    compiler: Any,
    componentLoaders: Any,
    loadChildren: (Injector, Route) => Observable_[LoadedRouterConfig],
    loadComponent: Route => Observable_[Type[Any]],
    loadModuleFactoryOrRoutes: Any
  ): RouterConfigLoader = {
    val __obj = js.Dynamic.literal(childrenLoaders = childrenLoaders.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], componentLoaders = componentLoaders.asInstanceOf[js.Any], loadChildren = js.Any.fromFunction2(loadChildren), loadComponent = js.Any.fromFunction1(loadComponent), loadModuleFactoryOrRoutes = loadModuleFactoryOrRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterConfigLoader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterConfigLoader] (val x: Self) extends AnyVal {
    
    inline def setChildrenLoaders(value: Any): Self = StObject.set(x, "childrenLoaders", value.asInstanceOf[js.Any])
    
    inline def setCompiler(value: Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setComponentLoaders(value: Any): Self = StObject.set(x, "componentLoaders", value.asInstanceOf[js.Any])
    
    inline def setLoadChildren(value: (Injector, Route) => Observable_[LoadedRouterConfig]): Self = StObject.set(x, "loadChildren", js.Any.fromFunction2(value))
    
    inline def setLoadComponent(value: Route => Observable_[Type[Any]]): Self = StObject.set(x, "loadComponent", js.Any.fromFunction1(value))
    
    inline def setLoadModuleFactoryOrRoutes(value: Any): Self = StObject.set(x, "loadModuleFactoryOrRoutes", value.asInstanceOf[js.Any])
    
    inline def setOnLoadEndListener(value: /* r */ Route => Unit): Self = StObject.set(x, "onLoadEndListener", js.Any.fromFunction1(value))
    
    inline def setOnLoadEndListenerUndefined: Self = StObject.set(x, "onLoadEndListener", js.undefined)
    
    inline def setOnLoadStartListener(value: /* r */ Route => Unit): Self = StObject.set(x, "onLoadStartListener", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartListenerUndefined: Self = StObject.set(x, "onLoadStartListener", js.undefined)
  }
}
