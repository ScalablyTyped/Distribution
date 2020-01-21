package typings.angularCompiler.templateAstMod

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
    visitAttr: (AttrAst, js.Any) => js.Any,
    visitBoundText: (BoundTextAst, js.Any) => js.Any,
    visitDirective: (DirectiveAst, js.Any) => js.Any,
    visitDirectiveProperty: (BoundDirectivePropertyAst, js.Any) => js.Any,
    visitElement: (ElementAst, js.Any) => js.Any,
    visitElementProperty: (BoundElementPropertyAst, js.Any) => js.Any,
    visitEmbeddedTemplate: (EmbeddedTemplateAst, js.Any) => js.Any,
    visitEvent: (BoundEventAst, js.Any) => js.Any,
    visitNgContent: (NgContentAst, js.Any) => js.Any,
    visitReference: (ReferenceAst, js.Any) => js.Any,
    visitText: (TextAst, js.Any) => js.Any,
    visitVariable: (VariableAst, js.Any) => js.Any,
    visit: (/* ast */ TemplateAst, /* context */ js.Any) => _ = null
  ): TemplateAstVisitor = {
    val __obj = js.Dynamic.literal(visitAttr = js.Any.fromFunction2(visitAttr), visitBoundText = js.Any.fromFunction2(visitBoundText), visitDirective = js.Any.fromFunction2(visitDirective), visitDirectiveProperty = js.Any.fromFunction2(visitDirectiveProperty), visitElement = js.Any.fromFunction2(visitElement), visitElementProperty = js.Any.fromFunction2(visitElementProperty), visitEmbeddedTemplate = js.Any.fromFunction2(visitEmbeddedTemplate), visitEvent = js.Any.fromFunction2(visitEvent), visitNgContent = js.Any.fromFunction2(visitNgContent), visitReference = js.Any.fromFunction2(visitReference), visitText = js.Any.fromFunction2(visitText), visitVariable = js.Any.fromFunction2(visitVariable))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction2(visit))
    __obj.asInstanceOf[TemplateAstVisitor]
  }
}

