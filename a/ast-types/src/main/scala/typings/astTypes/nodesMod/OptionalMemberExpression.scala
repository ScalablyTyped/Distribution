package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.MemberExpression, 'type'> ]: ast-types.ast-types/gen/nodes.MemberExpression[P]} */ trait OptionalMemberExpression extends ASTNode {
  var optional: Boolean
  var `type`: typings.astTypes.astTypesStrings.OptionalMemberExpression
}

object OptionalMemberExpression {
  @scala.inline
  def apply(optional: Boolean, `type`: typings.astTypes.astTypesStrings.OptionalMemberExpression): OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalMemberExpression]
  }
}

