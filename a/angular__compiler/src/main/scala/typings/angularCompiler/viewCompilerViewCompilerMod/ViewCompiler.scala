package typings.angularCompiler.viewCompilerViewCompilerMod

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.angularCompiler.templateAstMod.TemplateAst
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

