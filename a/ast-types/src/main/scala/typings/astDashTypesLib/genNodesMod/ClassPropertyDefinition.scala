package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ClassPropertyDefinition
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var definition: astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassPropertyDefinition
}

object ClassPropertyDefinition {
  @scala.inline
  def apply(
    definition: astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ClassPropertyDefinition
  ): ClassPropertyDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPropertyDefinition]
  }
}

