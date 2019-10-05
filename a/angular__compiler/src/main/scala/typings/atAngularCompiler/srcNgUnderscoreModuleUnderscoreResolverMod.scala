package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typings.atAngularCompiler.srcCoreMod.NgModule
import typings.atAngularCompiler.srcCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ng_module_resolver", JSImport.Namespace)
@js.native
object srcNgUnderscoreModuleUnderscoreResolverMod extends js.Object {
  @js.native
  class NgModuleResolver protected () extends js.Object {
    def this(_reflector: CompileReflector) = this()
    var _reflector: js.Any = js.native
    def isNgModule(`type`: js.Any): Boolean = js.native
    def resolve(`type`: Type): NgModule | Null = js.native
    def resolve(`type`: Type, throwIfNotFound: Boolean): NgModule | Null = js.native
  }
  
}

