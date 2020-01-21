package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait RestProperty extends ASTNode {
  var argument: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.RestProperty
}

object RestProperty {
  @scala.inline
  def apply(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.RestProperty): RestProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestProperty]
  }
}

