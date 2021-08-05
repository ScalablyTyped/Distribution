package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.staticReflectorMod.StaticReflector
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyRoutesMod {
  
  @JSImport("@angular/compiler/src/aot/lazy_routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listLazyRoutes(moduleMeta: CompileNgModuleMetadata, reflector: StaticReflector): js.Array[LazyRoute] = (^.asInstanceOf[js.Dynamic].applyDynamic("listLazyRoutes")(moduleMeta.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[js.Array[LazyRoute]]
  
  inline def parseLazyRoute(route: String, reflector: StaticReflector): LazyRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLazyRoute")(route.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[LazyRoute]
  inline def parseLazyRoute(route: String, reflector: StaticReflector, module: StaticSymbol): LazyRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLazyRoute")(route.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[LazyRoute]
  
  trait LazyRoute extends StObject {
    
    var module: StaticSymbol
    
    var referencedModule: StaticSymbol
    
    var route: String
  }
  object LazyRoute {
    
    inline def apply(module: StaticSymbol, referencedModule: StaticSymbol, route: String): LazyRoute = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], referencedModule = referencedModule.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyRoute]
    }
    
    extension [Self <: LazyRoute](x: Self) {
      
      inline def setModule(value: StaticSymbol): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setReferencedModule(value: StaticSymbol): Self = StObject.set(x, "referencedModule", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
