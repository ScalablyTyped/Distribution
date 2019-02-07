package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait VariableDeclaration extends js.Object {
  var declarations: js.Array[
    astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
  ]
  var kind: astDashTypesLib.astDashTypesLibStrings.`var` | astDashTypesLib.astDashTypesLibStrings.let | astDashTypesLib.astDashTypesLibStrings.const
  var `type`: astDashTypesLib.astDashTypesLibStrings.VariableDeclaration
}

