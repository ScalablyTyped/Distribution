package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait TupleTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.TupleTypeAnnotation
  var types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
}

object TupleTypeAnnotation {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.TupleTypeAnnotation,
    types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
  ): TupleTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TupleTypeAnnotation]
  }
}

