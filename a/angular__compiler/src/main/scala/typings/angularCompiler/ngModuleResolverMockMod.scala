package typings.angularCompiler

import typings.angularCompiler.coreMod.NgModule
import typings.angularCompiler.coreMod.Type
import typings.angularCompiler.mod.CompileReflector
import typings.angularCompiler.mod.NgModuleResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngModuleResolverMockMod {
  
  @JSImport("@angular/compiler/testing/src/ng_module_resolver_mock", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected () extends NgModuleResolver {
    def this(reflector: CompileReflector) = this()
    
    var _ngModules: js.Any = js.native
    
    /**
      * Overrides the {@link NgModule} for a module.
      */
    def setNgModule(`type`: Type, metadata: NgModule): Unit = js.native
  }
}
