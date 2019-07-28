package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "NgContentAst")
@js.native
class NgContentAst protected () extends TemplateAst {
  def this(index: Double, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
  var index: Double = js.native
  var ngContentIndex: Double = js.native
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

