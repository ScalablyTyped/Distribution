package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait TypeofTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var argument: astDashTypesLib.genKindsMod.FlowTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TypeofTypeAnnotation
}

object TypeofTypeAnnotation {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.FlowTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TypeofTypeAnnotation
  ): TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("argument")(argument)
    __obj.asInstanceOf[TypeofTypeAnnotation]
  }
}

