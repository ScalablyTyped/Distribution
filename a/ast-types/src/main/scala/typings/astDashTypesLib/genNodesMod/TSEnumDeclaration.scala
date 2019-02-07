package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSEnumDeclaration extends js.Object {
  var const: scala.Boolean
  var declare: scala.Boolean
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var initializer: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var members: js.Array[astDashTypesLib.genKindsMod.TSEnumMemberKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSEnumDeclaration
}

