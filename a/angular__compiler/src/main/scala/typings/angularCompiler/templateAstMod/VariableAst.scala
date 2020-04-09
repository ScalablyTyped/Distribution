package typings.angularCompiler.templateAstMod

import typings.angularCompiler.astMod.ParsedVariable
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "VariableAst")
@js.native
class VariableAst protected () extends TemplateAst {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
  val name: String = js.native
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  val value: String = js.native
  val valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@angular/compiler/src/template_parser/template_ast", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: ParsedVariable): VariableAst = js.native
}

