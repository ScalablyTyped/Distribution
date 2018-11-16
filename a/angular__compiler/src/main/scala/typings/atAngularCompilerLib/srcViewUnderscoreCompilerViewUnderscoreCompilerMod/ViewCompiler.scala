package typings
package atAngularCompilerLib.srcViewUnderscoreCompilerViewUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompiler")
@js.native
class ViewCompiler protected () extends js.Object {
  def this(_reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector) = this()
  var _reflector: js.Any = js.native
  def compileComponent(
    outputCtx: atAngularCompilerLib.srcUtilMod.OutputContext,
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    template: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ],
    styles: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    usedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary]
  ): ViewCompileResult = js.native
}

