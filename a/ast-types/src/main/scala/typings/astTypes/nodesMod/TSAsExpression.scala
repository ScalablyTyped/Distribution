package typings.astTypes.nodesMod

import typings.astTypes.AnonParenthesized
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait TSAsExpression extends ASTNode {
  var expression: ExpressionKind
  var extra: AnonParenthesized | Null
  var `type`: typings.astTypes.astTypesStrings.TSAsExpression
  var typeAnnotation: TSTypeKind
}

object TSAsExpression {
  @scala.inline
  def apply(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind,
    extra: AnonParenthesized = null
  ): TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSAsExpression]
  }
}

