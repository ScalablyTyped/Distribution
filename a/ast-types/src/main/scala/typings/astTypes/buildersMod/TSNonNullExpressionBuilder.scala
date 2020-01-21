package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSNonNullExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind): TSNonNullExpression = js.native
  def from(params: AnonCommentsExpression): TSNonNullExpression = js.native
}

