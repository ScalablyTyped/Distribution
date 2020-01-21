package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CatchClauseKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait TryStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var block: BlockStatementKind
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.undefined
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var handler: js.UndefOr[CatchClauseKind | Null] = js.undefined
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.TryStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TryStatement")
@js.native
object TryStatement extends TopLevel[Type[TryStatement]]

