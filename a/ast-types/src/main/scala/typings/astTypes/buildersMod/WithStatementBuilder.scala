package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLoc
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStatementBuilder extends js.Object {
  def apply(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  def from(params: AnonBodyCommentsLoc): WithStatement = js.native
}

