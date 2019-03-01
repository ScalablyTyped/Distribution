package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait UnionTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.UnionTypeAnnotation
  var types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
}

object UnionTypeAnnotation {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.UnionTypeAnnotation,
    types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
  ): UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[UnionTypeAnnotation]
  }
}

