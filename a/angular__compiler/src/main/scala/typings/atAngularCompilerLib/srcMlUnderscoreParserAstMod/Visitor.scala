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

