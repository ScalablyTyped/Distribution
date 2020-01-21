package typings.astTypes.buildersMod

import typings.astTypes.AnonAsyncBodyComments
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowFunctionExpressionBuilder extends js.Object {
  def apply(params: js.Array[PatternKind], body: BlockStatementKind): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: BlockStatementKind, expression: Boolean): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: ExpressionKind): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: ExpressionKind, expression: Boolean): ArrowFunctionExpression = js.native
  def from(params: AnonAsyncBodyComments): ArrowFunctionExpression = js.native
}

