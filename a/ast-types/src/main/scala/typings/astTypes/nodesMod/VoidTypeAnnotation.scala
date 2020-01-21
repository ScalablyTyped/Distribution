package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait VoidTypeAnnotation extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.VoidTypeAnnotation
}

object VoidTypeAnnotation {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.VoidTypeAnnotation): VoidTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidTypeAnnotation]
  }
}

