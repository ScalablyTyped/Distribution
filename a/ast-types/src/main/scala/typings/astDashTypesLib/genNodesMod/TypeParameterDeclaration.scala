package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TypeParameterDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var params: js.Array[astDashTypesLib.genKindsMod.TypeParameterKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TypeParameterDeclaration
}

object TypeParameterDeclaration {
  @scala.inline
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.TypeParameterKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TypeParameterDeclaration
  ): TypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypeParameterDeclaration]
  }
}

