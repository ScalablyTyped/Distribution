package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait TryStatement extends js.Object {
  var block: astDashTypesLib.genKindsMod.BlockStatementKind
  var finalizer: astDashTypesLib.genKindsMod.BlockStatementKind | scala.Null
  var guardedHandlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]
  var handler: astDashTypesLib.genKindsMod.CatchClauseKind | scala.Null
  var handlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TryStatement
}

