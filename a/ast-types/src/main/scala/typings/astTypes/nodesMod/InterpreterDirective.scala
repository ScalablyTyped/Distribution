package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait InterpreterDirective extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.InterpreterDirective
  var value: String
}

object InterpreterDirective {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.InterpreterDirective, value: String): InterpreterDirective = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpreterDirective]
  }
}

