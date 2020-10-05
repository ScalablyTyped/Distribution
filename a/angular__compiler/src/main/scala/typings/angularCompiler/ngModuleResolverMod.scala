package typings.angularCompiler

import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.coreMod.NgModule
import typings.angularCompiler.coreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ng_module_resolver", JSImport.Namespace)
@js.native
object ngModuleResolverMod extends js.Object {
  @js.native
  class NgModuleResolver protected () extends js.Object {
    def this(_reflector: CompileReflector) = this()
    var _reflector: js.Any = js.native
    def isNgModule(`type`: js.Any): Boolean = js.native
    def resolve(`type`: Type): NgModule | Null = js.native
    def resolve(`type`: Type, throwIfNotFound: Boolean): NgModule | Null = js.native
  }
  
}

