package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.Exclamationmark
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.Tilde
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.delete
import typings.astTypes.astTypesStrings.typeof
import typings.astTypes.astTypesStrings.void
import typings.astTypes.kindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait UnaryExpression extends ASTNode {
  var argument: ExpressionKind
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: Boolean
  var `type`: typings.astTypes.astTypesStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    `type`: typings.astTypes.astTypesStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
}

