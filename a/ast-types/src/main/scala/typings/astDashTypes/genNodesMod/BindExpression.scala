package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait BindExpression extends ASTNode {
  var callee: ExpressionKind
  var `object`: ExpressionKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.BindExpression
}

object BindExpression {
  @scala.inline
  def apply(
    callee: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.BindExpression,
    `object`: ExpressionKind = null
  ): BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindExpression]
  }
}

