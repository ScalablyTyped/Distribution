package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXSpreadAttribute extends ASTNode {
  var argument: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.JSXSpreadAttribute
}

object JSXSpreadAttribute {
  @scala.inline
  def apply(argument: ExpressionKind, `type`: typings.astDashTypes.astDashTypesStrings.JSXSpreadAttribute): JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadAttribute]
  }
}

