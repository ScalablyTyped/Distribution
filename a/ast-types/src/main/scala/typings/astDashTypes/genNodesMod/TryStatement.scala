package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.CatchClauseKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait TryStatement extends ASTNode {
  var block: BlockStatementKind
  var finalizer: BlockStatementKind | Null
  var guardedHandlers: js.Array[CatchClauseKind]
  var handler: CatchClauseKind | Null
  var handlers: js.Array[CatchClauseKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatementKind,
    guardedHandlers: js.Array[CatchClauseKind],
    handlers: js.Array[CatchClauseKind],
    `type`: typings.astDashTypes.astDashTypesStrings.TryStatement,
    finalizer: BlockStatementKind = null,
    handler: CatchClauseKind = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], guardedHandlers = guardedHandlers.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (finalizer != null) __obj.updateDynamic("finalizer")(finalizer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement]
  }
}

