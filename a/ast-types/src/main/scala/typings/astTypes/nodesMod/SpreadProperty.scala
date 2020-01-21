package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait SpreadProperty extends ASTNode {
  var argument: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.SpreadProperty
}

object SpreadProperty {
  @scala.inline
  def apply(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.SpreadProperty): SpreadProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadProperty]
  }
}

