package typings
package atAngularCompilerLib.srcNgUnderscoreModuleUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ng_module_resolver", "NgModuleResolver")
@js.native
class NgModuleResolver protected () extends js.Object {
  def this(_reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector) = this()
  var _reflector: js.Any = js.native
  def isNgModule(`type`: js.Any): scala.Boolean = js.native
  def resolve(`type`: atAngularCompilerLib.srcCoreMod.Type): atAngularCompilerLib.srcCoreMod.NgModule | scala.Null = js.native
  def resolve(`type`: atAngularCompilerLib.srcCoreMod.Type, throwIfNotFound: scala.Boolean): atAngularCompilerLib.srcCoreMod.NgModule | scala.Null = js.native
}

