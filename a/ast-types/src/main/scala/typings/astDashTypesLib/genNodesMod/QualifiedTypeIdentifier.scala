package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait QualifiedTypeIdentifier extends js.Object {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var qualification: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.QualifiedTypeIdentifier
}

