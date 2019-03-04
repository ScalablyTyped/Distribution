package typings
package atAngularCompilerLib.srcMlUnderscoreParserAstMod

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
    visitAttribute: js.Function2[Attribute, js.Any, js.Any],
    visitComment: js.Function2[Comment, js.Any, js.Any],
    visitElement: js.Function2[Element, js.Any, js.Any],
    visitExpansion: js.Function2[Expansion, js.Any, js.Any],
    visitExpansionCase: js.Function2[ExpansionCase, js.Any, js.Any],
    visitText: js.Function2[Text, js.Any, js.Any],
    visit: js.Function2[/* node */ Node, /* context */ js.Any, _] = null
  ): Visitor = {
    val __obj = js.Dynamic.literal(visitAttribute = visitAttribute, visitComment = visitComment, visitElement = visitElement, visitExpansion = visitExpansion, visitExpansionCase = visitExpansionCase, visitText = visitText)
    if (visit != null) __obj.updateDynamic("visit")(visit)
    __obj.asInstanceOf[Visitor]
  }
}

