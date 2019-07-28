package typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompiler")
@js.native
class ViewCompiler protected () extends js.Object {
  def this(_reflector: CompileReflector) = this()
  var _reflector: js.Any = js.native
  def compileComponent(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    template: js.Array[TemplateAst],
    styles: Expression,
    usedPipes: js.Array[CompilePipeSummary]
  ): ViewCompileResult = js.native
}

