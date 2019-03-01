package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSExternalModuleReference
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var expression: astDashTypesLib.genKindsMod.StringLiteralKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSExternalModuleReference
}

object TSExternalModuleReference {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.StringLiteralKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSExternalModuleReference
  ): TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[TSExternalModuleReference]
  }
}

