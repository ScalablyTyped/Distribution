package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLocTest
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhileStatementBuilder extends js.Object {
  def apply(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  def from(params: AnonBodyCommentsLocTest): WhileStatement = js.native
}

