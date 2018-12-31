package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundDirectivePropertyAst")
@js.native
class BoundDirectivePropertyAst protected () extends TemplateAst {
  def this(directiveName: java.lang.String, templateName: java.lang.String, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var directiveName: java.lang.String = js.native
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var templateName: java.lang.String = js.native
  var value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

