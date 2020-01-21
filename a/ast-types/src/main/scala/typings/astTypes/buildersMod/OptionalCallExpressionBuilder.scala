package typings.astTypes.buildersMod

import typings.astTypes.AnonArgumentsCallee
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalCallExpressionBuilder extends js.Object {
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): OptionalCallExpression = js.native
  def apply(
    callee: ExpressionKind,
    argumentsParam: js.Array[ExpressionKind | SpreadElementKind],
    optional: Boolean
  ): OptionalCallExpression = js.native
  def from(params: AnonArgumentsCallee): OptionalCallExpression = js.native
}

