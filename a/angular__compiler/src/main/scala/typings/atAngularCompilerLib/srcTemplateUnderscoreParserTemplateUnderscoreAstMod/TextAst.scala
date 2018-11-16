package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "TextAst")
@js.native
class TextAst protected () extends TemplateAst {
  def this(value: java.lang.String, ngContentIndex: scala.Double, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var ngContentIndex: scala.Double = js.native
  /**
       * The source span from which this node was parsed.
       */
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var value: java.lang.String = js.native
  /**
       * Visit this node and possibly transform it.
       */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

