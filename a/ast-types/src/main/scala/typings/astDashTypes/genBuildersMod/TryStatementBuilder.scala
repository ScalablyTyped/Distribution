package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Block
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.CatchClauseKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TryStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryStatementBuilder extends js.Object {
  def apply(block: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement = js.native
  def from(params: Anon_Block): TryStatement = js.native
}

