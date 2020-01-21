package typings.angularCompiler.templateAstMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.BoundElementProperty
import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected () extends TemplateAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  val isAnimation: Boolean = js.native
  var name: String = js.native
  var securityContext: SecurityContext = js.native
  /**
    * The source span from which this node was parsed.
    */
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var `type`: PropertyBindingType = js.native
  var unit: String | Null = js.native
  var value: AST = js.native
  /**
    * Visit this node and possibly transform it.
    */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: BoundElementProperty): BoundElementPropertyAst = js.native
}

