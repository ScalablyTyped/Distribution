package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLeft
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForAwaitStatementBuilder extends js.Object {
  def apply(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement = js.native
  def from(params: AnonBodyCommentsLeft): ForAwaitStatement = js.native
}

