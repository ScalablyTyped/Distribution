package typings.angularCompiler.templateAstMod

import typings.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "DirectiveAst")
@js.native
class DirectiveAst protected () extends TemplateAst {
  def this(
    directive: CompileDirectiveSummary,
    inputs: js.Array[BoundDirectivePropertyAst],
    hostProperties: js.Array[BoundElementPropertyAst],
    hostEvents: js.Array[BoundEventAst],
    contentQueryStartId: Double,
    sourceSpan: ParseSourceSpan
  ) = this()
  var contentQueryStartId: Double = js.native
  var directive: CompileDirectiveSummary = js.native
  var hostEvents: js.Array[BoundEventAst] = js.native
  var hostProperties: js.Array[BoundElementPropertyAst] = js.native
  var inputs: js.Array[BoundDirectivePropertyAst] = js.native
}

