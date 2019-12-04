package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait TypeofTypeAnnotation extends ASTNode {
  var argument: FlowTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TypeofTypeAnnotation
}

object TypeofTypeAnnotation {
  @scala.inline
  def apply(argument: FlowTypeKind, `type`: typings.astDashTypes.astDashTypesStrings.TypeofTypeAnnotation): TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTypeAnnotation]
  }
}

