package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateAstVisitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* ast */ TemplateAst, /* context */ js.Any, _]] = js.undefined
  def visitAttr(ast: AttrAst, context: js.Any): js.Any
  def visitBoundText(ast: BoundTextAst, context: js.Any): js.Any
  def visitDirective(ast: DirectiveAst, context: js.Any): js.Any
  def visitDirectiveProperty(ast: BoundDirectivePropertyAst, context: js.Any): js.Any
  def visitElement(ast: ElementAst, context: js.Any): js.Any
  def visitElementProperty(ast: BoundElementPropertyAst, context: js.Any): js.Any
  def visitEmbeddedTemplate(ast: EmbeddedTemplateAst, context: js.Any): js.Any
  def visitEvent(ast: BoundEventAst, context: js.Any): js.Any
  def visitNgContent(ast: NgContentAst, context: js.Any): js.Any
  def visitReference(ast: ReferenceAst, context: js.Any): js.Any
  def visitText(ast: TextAst, context: js.Any): js.Any
  def visitVariable(ast: VariableAst, context: js.Any): js.Any
}

