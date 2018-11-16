package typings
package atAngularCompilerLib.srcInjectableUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/injectable_compiler", "InjectableCompiler")
@js.native
class InjectableCompiler protected () extends js.Object {
  def this(reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector, alwaysGenerateDef: scala.Boolean) = this()
  var alwaysGenerateDef: js.Any = js.native
  var depsArray: js.Any = js.native
  var reflector: js.Any = js.native
  var tokenInjector: js.Any = js.native
  def compile(
    injectable: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata,
    ctx: atAngularCompilerLib.srcUtilMod.OutputContext
  ): scala.Unit = js.native
  def factoryFor(
    injectable: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata,
    ctx: atAngularCompilerLib.srcUtilMod.OutputContext
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def injectableDef(
    injectable: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata,
    ctx: atAngularCompilerLib.srcUtilMod.OutputContext
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
}

