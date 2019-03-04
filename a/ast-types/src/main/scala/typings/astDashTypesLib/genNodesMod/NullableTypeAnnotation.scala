package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait NullableTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.NullableTypeAnnotation
  var typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
}

object NullableTypeAnnotation {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.NullableTypeAnnotation,
    typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
  ): NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NullableTypeAnnotation]
  }
}

