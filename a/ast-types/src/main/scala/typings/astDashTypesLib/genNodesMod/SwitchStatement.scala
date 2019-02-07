package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait SwitchStatement extends js.Object {
  var cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind]
  var discriminant: astDashTypesLib.genKindsMod.ExpressionKind
  var lexical: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.SwitchStatement
}

