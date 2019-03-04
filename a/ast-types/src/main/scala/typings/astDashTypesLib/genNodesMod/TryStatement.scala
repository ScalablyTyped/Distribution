package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait TryStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var block: astDashTypesLib.genKindsMod.BlockStatementKind
  var finalizer: astDashTypesLib.genKindsMod.BlockStatementKind | scala.Null
  var guardedHandlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]
  var handler: astDashTypesLib.genKindsMod.CatchClauseKind | scala.Null
  var handlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: astDashTypesLib.genKindsMod.BlockStatementKind,
    guardedHandlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind],
    handlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TryStatement,
    finalizer: astDashTypesLib.genKindsMod.BlockStatementKind = null,
    handler: astDashTypesLib.genKindsMod.CatchClauseKind = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block, guardedHandlers = guardedHandlers, handlers = handlers)
    __obj.updateDynamic("type")(`type`)
    if (finalizer != null) __obj.updateDynamic("finalizer")(finalizer)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    __obj.asInstanceOf[TryStatement]
  }
}

