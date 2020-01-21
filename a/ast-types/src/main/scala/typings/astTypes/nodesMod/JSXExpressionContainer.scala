package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXExpressionContainer extends ASTNode {
  var expression: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.JSXExpressionContainer
}

object JSXExpressionContainer {
  @scala.inline
  def apply(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.JSXExpressionContainer): JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer]
  }
}

