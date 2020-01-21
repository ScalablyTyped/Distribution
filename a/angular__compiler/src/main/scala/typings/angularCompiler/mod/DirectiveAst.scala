package typings.angularCompiler.mod

import typings.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "DirectiveAst")
@js.native
class DirectiveAst protected ()
  extends typings.angularCompiler.publicApiMod.DirectiveAst {
  def this(
    directive: CompileDirectiveSummary,
    inputs: js.Array[typings.angularCompiler.templateAstMod.BoundDirectivePropertyAst],
    hostProperties: js.Array[typings.angularCompiler.templateAstMod.BoundElementPropertyAst],
    hostEvents: js.Array[typings.angularCompiler.templateAstMod.BoundEventAst],
    contentQueryStartId: Double,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

