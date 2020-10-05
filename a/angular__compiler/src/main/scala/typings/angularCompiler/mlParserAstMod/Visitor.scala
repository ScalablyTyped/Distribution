package typings.angularCompiler.mlParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Visitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* node */ Node, /* context */ js.Any, _]] = js.native
  def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
  def visitComment(comment: Comment, context: js.Any): js.Any = js.native
  def visitElement(element: Element, context: js.Any): js.Any = js.native
  def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
  def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
  def visitText(text: Text, context: js.Any): js.Any = js.native
}

object Visitor {
  @scala.inline
  def apply(
    visitAttribute: (Attribute, js.Any) => js.Any,
    visitComment: (Comment, js.Any) => js.Any,
    visitElement: (Element, js.Any) => js.Any,
    visitExpansion: (Expansion, js.Any) => js.Any,
    visitExpansionCase: (ExpansionCase, js.Any) => js.Any,
    visitText: (Text, js.Any) => js.Any
  ): Visitor = {
    val __obj = js.Dynamic.literal(visitAttribute = js.Any.fromFunction2(visitAttribute), visitComment = js.Any.fromFunction2(visitComment), visitElement = js.Any.fromFunction2(visitElement), visitExpansion = js.Any.fromFunction2(visitExpansion), visitExpansionCase = js.Any.fromFunction2(visitExpansionCase), visitText = js.Any.fromFunction2(visitText))
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
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
    def setVisitAttribute(value: (Attribute, js.Any) => js.Any): Self = this.set("visitAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitComment(value: (Comment, js.Any) => js.Any): Self = this.set("visitComment", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitElement(value: (Element, js.Any) => js.Any): Self = this.set("visitElement", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitExpansion(value: (Expansion, js.Any) => js.Any): Self = this.set("visitExpansion", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitExpansionCase(value: (ExpansionCase, js.Any) => js.Any): Self = this.set("visitExpansionCase", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitText(value: (Text, js.Any) => js.Any): Self = this.set("visitText", js.Any.fromFunction2(value))
    @scala.inline
    def setVisit(value: (/* node */ Node, /* context */ js.Any) => _): Self = this.set("visit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteVisit: Self = this.set("visit", js.undefined)
  }
  
}

