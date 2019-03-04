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

object TemplateAstVisitor {
  @scala.inline
  def apply(
    visitAttr: js.Function2[AttrAst, js.Any, js.Any],
    visitBoundText: js.Function2[BoundTextAst, js.Any, js.Any],
    visitDirective: js.Function2[DirectiveAst, js.Any, js.Any],
    visitDirectiveProperty: js.Function2[BoundDirectivePropertyAst, js.Any, js.Any],
    visitElement: js.Function2[ElementAst, js.Any, js.Any],
    visitElementProperty: js.Function2[BoundElementPropertyAst, js.Any, js.Any],
    visitEmbeddedTemplate: js.Function2[EmbeddedTemplateAst, js.Any, js.Any],
    visitEvent: js.Function2[BoundEventAst, js.Any, js.Any],
    visitNgContent: js.Function2[NgContentAst, js.Any, js.Any],
    visitReference: js.Function2[ReferenceAst, js.Any, js.Any],
    visitText: js.Function2[TextAst, js.Any, js.Any],
    visitVariable: js.Function2[VariableAst, js.Any, js.Any],
    visit: js.Function2[/* ast */ TemplateAst, /* context */ js.Any, _] = null
  ): TemplateAstVisitor = {
    val __obj = js.Dynamic.literal(visitAttr = visitAttr, visitBoundText = visitBoundText, visitDirective = visitDirective, visitDirectiveProperty = visitDirectiveProperty, visitElement = visitElement, visitElementProperty = visitElementProperty, visitEmbeddedTemplate = visitEmbeddedTemplate, visitEvent = visitEvent, visitNgContent = visitNgContent, visitReference = visitReference, visitText = visitText, visitVariable = visitVariable)
    if (visit != null) __obj.updateDynamic("visit")(visit)
    __obj.asInstanceOf[TemplateAstVisitor]
  }
}

