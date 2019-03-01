package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSTypeParameterDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var params: js.Array[astDashTypesLib.genKindsMod.TSTypeParameterKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameterDeclaration
}

object TSTypeParameterDeclaration {
  @scala.inline
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.TSTypeParameterKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameterDeclaration
  ): TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[TSTypeParameterDeclaration]
  }
}

