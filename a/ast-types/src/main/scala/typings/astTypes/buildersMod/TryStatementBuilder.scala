package typings.astTypes.buildersMod

import typings.astTypes.AnonBlock
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CatchClauseKind
import typings.astTypes.namedTypesMod.namedTypes.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryStatementBuilder extends js.Object {
  def apply(block: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement = js.native
  def from(params: AnonBlock): TryStatement = js.native
}

