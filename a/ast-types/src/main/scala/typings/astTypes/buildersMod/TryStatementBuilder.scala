package typings.astTypes.buildersMod

import typings.astTypes.anon.Block
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CatchClauseKind
import typings.astTypes.namedTypesMod.namedTypes.TryStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryStatementBuilder extends StObject {
  
  def apply(block: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: Unit, finalizer: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement = js.native
  
  def from(params: Block): TryStatement = js.native
}
