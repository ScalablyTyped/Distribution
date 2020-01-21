package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsLeftLoc
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.ForOfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForOfStatementBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def from(params: AnonBodyCommentsLeftLoc): ForOfStatement = js.native
}

