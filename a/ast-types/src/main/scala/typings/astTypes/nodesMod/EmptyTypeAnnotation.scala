package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait EmptyTypeAnnotation extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.EmptyTypeAnnotation
}

object EmptyTypeAnnotation {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.EmptyTypeAnnotation): EmptyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyTypeAnnotation]
  }
}

