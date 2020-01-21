package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait WhileStatement extends ASTNode {
  var body: StatementKind
  var test: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.WhileStatement
}

object WhileStatement {
  @scala.inline
  def apply(body: StatementKind, test: ExpressionKind, `type`: typings.astTypes.astTypesStrings.WhileStatement): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhileStatement]
  }
}

