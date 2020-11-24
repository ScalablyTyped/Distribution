package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CatchClauseKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
@js.native
trait TryStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var block: BlockStatementKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.native
  
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.native
  
  var handler: js.UndefOr[CatchClauseKind | Null] = js.native
  
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.TryStatement = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.TryStatement")
@js.native
object TryStatement extends TopLevel[Type[TryStatement]]
