package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait SequenceExpression extends ASTNode {
  var expressions: js.Array[ExpressionKind]
  var `type`: typings.astTypes.astTypesStrings.SequenceExpression
}

object SequenceExpression {
  @scala.inline
  def apply(expressions: js.Array[ExpressionKind], `type`: typings.astTypes.astTypesStrings.SequenceExpression): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceExpression]
  }
}

