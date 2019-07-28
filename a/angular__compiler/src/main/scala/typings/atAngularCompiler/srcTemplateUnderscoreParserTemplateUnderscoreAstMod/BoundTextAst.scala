package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundTextAst")
@js.native
class BoundTextAst protected () extends TemplateAst {
  def this(value: AST, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
  var ngContentIndex: Double = js.native
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: AST = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

