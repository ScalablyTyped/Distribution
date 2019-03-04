package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait ArrayTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var elementType: astDashTypesLib.genKindsMod.FlowTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ArrayTypeAnnotation
}

object ArrayTypeAnnotation {
  @scala.inline
  def apply(
    elementType: astDashTypesLib.genKindsMod.FlowTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ArrayTypeAnnotation
  ): ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArrayTypeAnnotation]
  }
}

