package typings.angularCompiler.templateAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateAstVisitor extends js.Object {
  
  var visit: js.UndefOr[js.Function2[/* ast */ TemplateAst, /* context */ js.Any, _]] = js.native
  
  def visitAttr(ast: AttrAst, context: js.Any): js.Any = js.native
  
  def visitBoundText(ast: BoundTextAst, context: js.Any): js.Any = js.native
  
  def visitDirective(ast: DirectiveAst, context: js.Any): js.Any = js.native
  
  def visitDirectiveProperty(ast: BoundDirectivePropertyAst, context: js.Any): js.Any = js.native
  
  def visitElement(ast: ElementAst, context: js.Any): js.Any = js.native
  
  def visitElementProperty(ast: BoundElementPropertyAst, context: js.Any): js.Any = js.native
  
  def visitEmbeddedTemplate(ast: EmbeddedTemplateAst, context: js.Any): js.Any = js.native
  
  def visitEvent(ast: BoundEventAst, context: js.Any): js.Any = js.native
  
  def visitNgContent(ast: NgContentAst, context: js.Any): js.Any = js.native
  
  def visitReference(ast: ReferenceAst, context: js.Any): js.Any = js.native
  
  def visitText(ast: TextAst, context: js.Any): js.Any = js.native
  
  def visitVariable(ast: VariableAst, context: js.Any): js.Any = js.native
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
    visitVariable: (VariableAst, js.Any) => js.Any
  ): TemplateAstVisitor = {
    val __obj = js.Dynamic.literal(visitAttr = js.Any.fromFunction2(visitAttr), visitBoundText = js.Any.fromFunction2(visitBoundText), visitDirective = js.Any.fromFunction2(visitDirective), visitDirectiveProperty = js.Any.fromFunction2(visitDirectiveProperty), visitElement = js.Any.fromFunction2(visitElement), visitElementProperty = js.Any.fromFunction2(visitElementProperty), visitEmbeddedTemplate = js.Any.fromFunction2(visitEmbeddedTemplate), visitEvent = js.Any.fromFunction2(visitEvent), visitNgContent = js.Any.fromFunction2(visitNgContent), visitReference = js.Any.fromFunction2(visitReference), visitText = js.Any.fromFunction2(visitText), visitVariable = js.Any.fromFunction2(visitVariable))
    __obj.asInstanceOf[TemplateAstVisitor]
  }
  
  @scala.inline
  implicit class TemplateAstVisitorOps[Self <: TemplateAstVisitor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVisitAttr(value: (AttrAst, js.Any) => js.Any): Self = this.set("visitAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitBoundText(value: (BoundTextAst, js.Any) => js.Any): Self = this.set("visitBoundText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitDirective(value: (DirectiveAst, js.Any) => js.Any): Self = this.set("visitDirective", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitDirectiveProperty(value: (BoundDirectivePropertyAst, js.Any) => js.Any): Self = this.set("visitDirectiveProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitElement(value: (ElementAst, js.Any) => js.Any): Self = this.set("visitElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitElementProperty(value: (BoundElementPropertyAst, js.Any) => js.Any): Self = this.set("visitElementProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitEmbeddedTemplate(value: (EmbeddedTemplateAst, js.Any) => js.Any): Self = this.set("visitEmbeddedTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitEvent(value: (BoundEventAst, js.Any) => js.Any): Self = this.set("visitEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitNgContent(value: (NgContentAst, js.Any) => js.Any): Self = this.set("visitNgContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitReference(value: (ReferenceAst, js.Any) => js.Any): Self = this.set("visitReference", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitText(value: (TextAst, js.Any) => js.Any): Self = this.set("visitText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitVariable(value: (VariableAst, js.Any) => js.Any): Self = this.set("visitVariable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisit(value: (/* ast */ TemplateAst, /* context */ js.Any) => _): Self = this.set("visit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVisit: Self = this.set("visit", js.undefined)
  }
}
