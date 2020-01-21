package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind): ParenthesizedExpression = js.native
  def from(params: AnonCommentsExpression): ParenthesizedExpression = js.native
}

