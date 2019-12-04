package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/nodes.FlowPredicate[P]} */ trait DeclaredPredicate extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclaredPredicate
  var value: ExpressionKind
}

object DeclaredPredicate {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.DeclaredPredicate, value: ExpressionKind): DeclaredPredicate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclaredPredicate]
  }
}

