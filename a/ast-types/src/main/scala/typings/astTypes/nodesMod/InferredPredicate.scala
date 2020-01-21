package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/nodes.FlowPredicate[P]} */ trait InferredPredicate extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.InferredPredicate
}

object InferredPredicate {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.InferredPredicate): InferredPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferredPredicate]
  }
}

