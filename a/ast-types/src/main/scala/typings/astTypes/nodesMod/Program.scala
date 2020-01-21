package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.DirectiveKind
import typings.astTypes.kindsMod.InterpreterDirectiveKind
import typings.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Program extends ASTNode {
  var body: js.Array[StatementKind]
  var directives: js.Array[DirectiveKind]
  var interpreter: InterpreterDirectiveKind | Null
  var `type`: typings.astTypes.astTypesStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    directives: js.Array[DirectiveKind],
    `type`: typings.astTypes.astTypesStrings.Program,
    interpreter: InterpreterDirectiveKind = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

