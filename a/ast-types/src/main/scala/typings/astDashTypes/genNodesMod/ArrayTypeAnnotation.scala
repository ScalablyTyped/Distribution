package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait ArrayTypeAnnotation extends ASTNode {
  var elementType: FlowTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ArrayTypeAnnotation
}

object ArrayTypeAnnotation {
  @scala.inline
  def apply(elementType: FlowTypeKind, `type`: typings.astDashTypes.astDashTypesStrings.ArrayTypeAnnotation): ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeAnnotation]
  }
}

