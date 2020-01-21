package typings.angularCompiler.mlParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* node */ Node, /* context */ js.Any, _]] = js.undefined
  def visitAttribute(attribute: Attribute, context: js.Any): js.Any
  def visitComment(comment: Comment, context: js.Any): js.Any
  def visitElement(element: Element, context: js.Any): js.Any
  def visitExpansion(expansion: Expansion, context: js.Any): js.Any
  def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any
  def visitText(text: Text, context: js.Any): js.Any
}

object Visitor {
  @scala.inline
  def apply(
    visitAttribute: (Attribute, js.Any) => js.Any,
    visitComment: (Comment, js.Any) => js.Any,
    visitElement: (Element, js.Any) => js.Any,
    visitExpansion: (Expansion, js.Any) => js.Any,
    visitExpansionCase: (ExpansionCase, js.Any) => js.Any,
    visitText: (Text, js.Any) => js.Any,
    visit: (/* node */ Node, /* context */ js.Any) => _ = null
  ): Visitor = {
    val __obj = js.Dynamic.literal(visitAttribute = js.Any.fromFunction2(visitAttribute), visitComment = js.Any.fromFunction2(visitComment), visitElement = js.Any.fromFunction2(visitElement), visitExpansion = js.Any.fromFunction2(visitExpansion), visitExpansionCase = js.Any.fromFunction2(visitExpansionCase), visitText = js.Any.fromFunction2(visitText))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Visitor]
  }
}

