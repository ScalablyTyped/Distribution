package typings
package atAngularCompilerLib.srcNgUnderscoreModuleUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ng_module_compiler", "NgModuleCompiler")
@js.native
class NgModuleCompiler protected () extends js.Object {
  def this(reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector) = this()
  var _createNgModuleFactory: js.Any = js.native
  var reflector: js.Any = js.native
  def compile(
    ctx: atAngularCompilerLib.srcUtilMod.OutputContext,
    ngModuleMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata,
    extraProviders: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata]
  ): NgModuleCompileResult = js.native
  def createStub(ctx: atAngularCompilerLib.srcUtilMod.OutputContext, ngModuleReference: js.Any): scala.Unit = js.native
}

