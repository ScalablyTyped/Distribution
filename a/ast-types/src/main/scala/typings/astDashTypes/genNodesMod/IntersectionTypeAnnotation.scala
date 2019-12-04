package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait IntersectionTypeAnnotation extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.IntersectionTypeAnnotation
  var types: js.Array[FlowTypeKind]
}

object IntersectionTypeAnnotation {
  @scala.inline
  def apply(
    `type`: typings.astDashTypes.astDashTypesStrings.IntersectionTypeAnnotation,
    types: js.Array[FlowTypeKind]
  ): IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTypeAnnotation]
  }
}

