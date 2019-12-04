package typings.atAngularCompiler

import typings.atAngularCompiler.atAngularCompilerMod.CompileReflector
import typings.atAngularCompiler.atAngularCompilerMod.NgModuleResolver
import typings.atAngularCompiler.srcCoreMod.NgModule
import typings.atAngularCompiler.srcCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/testing/src/ng_module_resolver_mock", JSImport.Namespace)
@js.native
object testingSrcNgUnderscoreModuleUnderscoreResolverUnderscoreMockMod extends js.Object {
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

