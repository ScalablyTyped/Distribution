package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpressions
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.SequenceExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceExpressionBuilder extends js.Object {
  def apply(expressions: js.Array[ExpressionKind]): SequenceExpression = js.native
  def from(params: AnonCommentsExpressions): SequenceExpression = js.native
}

