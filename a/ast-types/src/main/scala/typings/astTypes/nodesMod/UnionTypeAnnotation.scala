package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait UnionTypeAnnotation extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.UnionTypeAnnotation
  var types: js.Array[FlowTypeKind]
}

object UnionTypeAnnotation {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.UnionTypeAnnotation, types: js.Array[FlowTypeKind]): UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeAnnotation]
  }
}

