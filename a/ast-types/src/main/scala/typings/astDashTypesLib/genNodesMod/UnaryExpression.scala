package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait UnaryExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind
  var operator: astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`!` | astDashTypesLib.astDashTypesLibStrings.`~` | astDashTypesLib.astDashTypesLibStrings.typeof | astDashTypesLib.astDashTypesLibStrings.void | astDashTypesLib.astDashTypesLibStrings.delete
  var prefix: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`!` | astDashTypesLib.astDashTypesLibStrings.`~` | astDashTypesLib.astDashTypesLibStrings.typeof | astDashTypesLib.astDashTypesLibStrings.void | astDashTypesLib.astDashTypesLibStrings.delete,
    prefix: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("argument")(argument)
    __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[UnaryExpression]
  }
}

