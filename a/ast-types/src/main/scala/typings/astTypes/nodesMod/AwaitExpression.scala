package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait AwaitExpression extends ASTNode {
  var all: Boolean
  var argument: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.AwaitExpression
}

object AwaitExpression {
  @scala.inline
  def apply(
    all: Boolean,
    `type`: typings.astTypes.astTypesStrings.AwaitExpression,
    argument: ExpressionKind = null
  ): AwaitExpression = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitExpression]
  }
}

