package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait UpdateExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind
  var operator: astDashTypesLib.astDashTypesLibStrings.`++` | astDashTypesLib.astDashTypesLibStrings.`--`
  var prefix: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`++` | astDashTypesLib.astDashTypesLibStrings.`--`,
    prefix: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.UpdateExpression
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument, operator = operator.asInstanceOf[js.Any], prefix = prefix)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateExpression]
  }
}

