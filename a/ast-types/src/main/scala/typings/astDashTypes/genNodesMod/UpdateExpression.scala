package typings.astDashTypes.genNodesMod

import typings.astDashTypes.astDashTypesStrings.`++`
import typings.astDashTypes.astDashTypesStrings.`--`
import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait UpdateExpression extends ASTNode {
  var argument: ExpressionKind
  var operator: `++` | `--`
  var prefix: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `++` | `--`,
    prefix: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.UpdateExpression
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpression]
  }
}

