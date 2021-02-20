package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.staticReflectorMod.StaticReflector
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyRoutesMod {
  
  @JSImport("@angular/compiler/src/aot/lazy_routes", "listLazyRoutes")
  @js.native
  def listLazyRoutes(moduleMeta: CompileNgModuleMetadata, reflector: StaticReflector): js.Array[LazyRoute] = js.native
  
  @JSImport("@angular/compiler/src/aot/lazy_routes", "parseLazyRoute")
  @js.native
  def parseLazyRoute(route: String, reflector: StaticReflector): LazyRoute = js.native
  @JSImport("@angular/compiler/src/aot/lazy_routes", "parseLazyRoute")
  @js.native
  def parseLazyRoute(route: String, reflector: StaticReflector, module: StaticSymbol): LazyRoute = js.native
  
  @js.native
  trait LazyRoute extends StObject {
    
    var module: StaticSymbol = js.native
    
    var referencedModule: StaticSymbol = js.native
    
    var route: String = js.native
  }
  object LazyRoute {
    
    @scala.inline
    def apply(module: StaticSymbol, referencedModule: StaticSymbol, route: String): LazyRoute = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], referencedModule = referencedModule.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyRoute]
    }
    
    @scala.inline
    implicit class LazyRouteMutableBuilder[Self <: LazyRoute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule(value: StaticSymbol): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencedModule(value: StaticSymbol): Self = StObject.set(x, "referencedModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
