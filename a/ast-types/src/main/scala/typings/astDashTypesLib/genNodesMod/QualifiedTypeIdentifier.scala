package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait QualifiedTypeIdentifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var qualification: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.QualifiedTypeIdentifier
}

object QualifiedTypeIdentifier {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    qualification: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.QualifiedTypeIdentifier
  ): QualifiedTypeIdentifier = {
    val __obj = js.Dynamic.literal(id = id, qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QualifiedTypeIdentifier]
  }
}

