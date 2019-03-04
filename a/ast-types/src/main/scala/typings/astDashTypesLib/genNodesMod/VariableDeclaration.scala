package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait VariableDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var declarations: js.Array[
    astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
  ]
  var kind: astDashTypesLib.astDashTypesLibStrings.`var` | astDashTypesLib.astDashTypesLibStrings.let | astDashTypesLib.astDashTypesLibStrings.const
  var `type`: astDashTypesLib.astDashTypesLibStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[
      astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
    ],
    kind: astDashTypesLib.astDashTypesLibStrings.`var` | astDashTypesLib.astDashTypesLibStrings.let | astDashTypesLib.astDashTypesLibStrings.const,
    `type`: astDashTypesLib.astDashTypesLibStrings.VariableDeclaration
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations, kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

