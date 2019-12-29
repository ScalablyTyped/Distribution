package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLeftLoc
import typings.astDashTypes.astDashTypesStrings.AmpersandAmpersand
import typings.astDashTypes.astDashTypesStrings.QuestionmarkQuestionmark
import typings.astDashTypes.astDashTypesStrings.VerticallineVerticalline
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalExpressionBuilder extends js.Object {
  def apply(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def from(params: Anon_CommentsLeftLoc): LogicalExpression = js.native
}

