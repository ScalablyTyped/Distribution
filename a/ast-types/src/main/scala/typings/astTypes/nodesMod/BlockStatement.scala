package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.DirectiveKind
import typings.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait BlockStatement extends ASTNode {
  var body: js.Array[StatementKind]
  var directives: js.Array[DirectiveKind]
  var `type`: typings.astTypes.astTypesStrings.BlockStatement
}

object BlockStatement {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    directives: js.Array[DirectiveKind],
    `type`: typings.astTypes.astTypesStrings.BlockStatement
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement]
  }
}

