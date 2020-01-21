package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait IfStatement extends ASTNode {
  var alternate: StatementKind | Null
  var consequent: StatementKind
  var test: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: StatementKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.IfStatement,
    alternate: StatementKind = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

