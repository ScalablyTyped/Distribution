package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
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
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

