package typings.astTypes.buildersMod

import typings.astTypes.AnonAlternateComments
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpressionBuilder extends js.Object {
  def apply(test: ExpressionKind, consequent: ExpressionKind, alternate: ExpressionKind): ConditionalExpression = js.native
  def from(params: AnonAlternateComments): ConditionalExpression = js.native
}

