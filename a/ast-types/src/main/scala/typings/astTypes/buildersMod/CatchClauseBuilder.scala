package typings.astTypes.buildersMod

import typings.astTypes.AnonBodyCommentsGuard
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchClauseBuilder extends js.Object {
  def apply(param: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def apply(param: js.UndefOr[scala.Nothing], guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: js.UndefOr[scala.Nothing], guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def from(params: AnonBodyCommentsGuard): CatchClause = js.native
}

