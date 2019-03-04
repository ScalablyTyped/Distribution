package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Function, 'type' | 'id'> ]: ast-types.ast-types/gen/nodes.Function[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait FunctionDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.FunctionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.FunctionDeclaration
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.FunctionDeclaration
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

