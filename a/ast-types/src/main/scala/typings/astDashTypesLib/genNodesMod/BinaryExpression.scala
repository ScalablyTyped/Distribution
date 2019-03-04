package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait BinaryExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var left: astDashTypesLib.genKindsMod.ExpressionKind
  var operator: astDashTypesLib.astDashTypesLibStrings.`==` | astDashTypesLib.astDashTypesLibStrings.`!=` | astDashTypesLib.astDashTypesLibStrings.`===` | astDashTypesLib.astDashTypesLibStrings.`!==` | astDashTypesLib.astDashTypesLibStrings.`<` | astDashTypesLib.astDashTypesLibStrings.`<=` | astDashTypesLib.astDashTypesLibStrings.`>` | astDashTypesLib.astDashTypesLibStrings.`>=` | astDashTypesLib.astDashTypesLibStrings.`<<` | astDashTypesLib.astDashTypesLibStrings.`>>` | astDashTypesLib.astDashTypesLibStrings.`>>>` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`*` | astDashTypesLib.astDashTypesLibStrings.`/` | astDashTypesLib.astDashTypesLibStrings.`%` | astDashTypesLib.astDashTypesLibStrings.`**` | astDashTypesLib.astDashTypesLibStrings.`&` | astDashTypesLib.astDashTypesLibStrings.`|` | astDashTypesLib.astDashTypesLibStrings.`_backtick^_backtick` | astDashTypesLib.astDashTypesLibStrings.in | astDashTypesLib.astDashTypesLibStrings.instanceof
  var right: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`==` | astDashTypesLib.astDashTypesLibStrings.`!=` | astDashTypesLib.astDashTypesLibStrings.`===` | astDashTypesLib.astDashTypesLibStrings.`!==` | astDashTypesLib.astDashTypesLibStrings.`<` | astDashTypesLib.astDashTypesLibStrings.`<=` | astDashTypesLib.astDashTypesLibStrings.`>` | astDashTypesLib.astDashTypesLibStrings.`>=` | astDashTypesLib.astDashTypesLibStrings.`<<` | astDashTypesLib.astDashTypesLibStrings.`>>` | astDashTypesLib.astDashTypesLibStrings.`>>>` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`*` | astDashTypesLib.astDashTypesLibStrings.`/` | astDashTypesLib.astDashTypesLibStrings.`%` | astDashTypesLib.astDashTypesLibStrings.`**` | astDashTypesLib.astDashTypesLibStrings.`&` | astDashTypesLib.astDashTypesLibStrings.`|` | astDashTypesLib.astDashTypesLibStrings.`_backtick^_backtick` | astDashTypesLib.astDashTypesLibStrings.in | astDashTypesLib.astDashTypesLibStrings.instanceof,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.BinaryExpression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BinaryExpression]
  }
}

