package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatementBuilder extends js.Object {
  def apply(expression: ExpressionKind): ExpressionStatement = js.native
  def from(params: AnonCommentsExpression): ExpressionStatement = js.native
}

