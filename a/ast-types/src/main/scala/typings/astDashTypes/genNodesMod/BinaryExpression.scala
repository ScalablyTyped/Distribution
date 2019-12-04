package typings.astDashTypes.genNodesMod

import typings.astDashTypes.astDashTypesStrings.`!==`
import typings.astDashTypes.astDashTypesStrings.`!=`
import typings.astDashTypes.astDashTypesStrings.`%`
import typings.astDashTypes.astDashTypesStrings.`&`
import typings.astDashTypes.astDashTypesStrings.`**`
import typings.astDashTypes.astDashTypesStrings.`+`
import typings.astDashTypes.astDashTypesStrings.`-`
import typings.astDashTypes.astDashTypesStrings.`/`
import typings.astDashTypes.astDashTypesStrings.`<<`
import typings.astDashTypes.astDashTypesStrings.`<=`
import typings.astDashTypes.astDashTypesStrings.`<`
import typings.astDashTypes.astDashTypesStrings.`===`
import typings.astDashTypes.astDashTypesStrings.`==`
import typings.astDashTypes.astDashTypesStrings.`>=`
import typings.astDashTypes.astDashTypesStrings.`>>>`
import typings.astDashTypes.astDashTypesStrings.`>>`
import typings.astDashTypes.astDashTypesStrings.`>`
import typings.astDashTypes.astDashTypesStrings.`_backtick^_backtick`
import typings.astDashTypes.astDashTypesStrings.in
import typings.astDashTypes.astDashTypesStrings.instanceof
import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait BinaryExpression extends ASTNode {
  var left: ExpressionKind
  var operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typings.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typings.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typings.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typings.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof,
    right: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.BinaryExpression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

