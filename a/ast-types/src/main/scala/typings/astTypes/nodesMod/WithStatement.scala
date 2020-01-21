package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait WithStatement extends ASTNode {
  var body: StatementKind
  var `object`: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.WithStatement
}

object WithStatement {
  @scala.inline
  def apply(
    body: StatementKind,
    `object`: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.WithStatement
  ): WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement]
  }
}

