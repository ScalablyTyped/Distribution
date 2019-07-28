package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "AttrAst")
@js.native
class AttrAst protected () extends TemplateAst {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: String = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

