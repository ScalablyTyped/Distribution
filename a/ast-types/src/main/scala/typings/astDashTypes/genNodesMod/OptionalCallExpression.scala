package typings.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.CallExpression, 'type'> ]: ast-types.ast-types/gen/nodes.CallExpression[P]} */ trait OptionalCallExpression extends ASTNode {
  var optional: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.OptionalCallExpression
}

object OptionalCallExpression {
  @scala.inline
  def apply(optional: Boolean, `type`: typings.astDashTypes.astDashTypesStrings.OptionalCallExpression): OptionalCallExpression = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalCallExpression]
  }
}

