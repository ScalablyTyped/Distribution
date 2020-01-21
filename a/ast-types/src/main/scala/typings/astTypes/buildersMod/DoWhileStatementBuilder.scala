package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLocTest
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoWhileStatementBuilder extends js.Object {
  def apply(body: StatementKind, test: ExpressionKind): DoWhileStatement = js.native
  def from(params: AnonBodyCommentsLocTest): DoWhileStatement = js.native
}

