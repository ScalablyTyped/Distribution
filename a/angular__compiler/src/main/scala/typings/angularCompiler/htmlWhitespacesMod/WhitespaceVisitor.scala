package typings.angularCompiler.htmlWhitespacesMod

import typings.angularCompiler.mlParserAstMod.Attribute
import typings.angularCompiler.mlParserAstMod.Comment
import typings.angularCompiler.mlParserAstMod.Element
import typings.angularCompiler.mlParserAstMod.Expansion
import typings.angularCompiler.mlParserAstMod.ExpansionCase
import typings.angularCompiler.mlParserAstMod.Text
import typings.angularCompiler.mlParserAstMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_whitespaces", "WhitespaceVisitor")
@js.native
class WhitespaceVisitor () extends Visitor {
  /* CompleteClass */
  override def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitComment(comment: Comment, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitElement(element: Element, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
  def visitText(text: Text): js.Any = js.native
  /* CompleteClass */
  override def visitText(text: Text, context: js.Any): js.Any = js.native
  def visitText(text: Text, context: SiblingVisitorContext): js.Any = js.native
}

