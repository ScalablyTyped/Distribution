package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait CatchClause extends ASTNode {
  var body: BlockStatementKind
  var guard: ExpressionKind | Null
  var param: PatternKind | Null
  var `type`: typings.astTypes.astTypesStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    `type`: typings.astTypes.astTypesStrings.CatchClause,
    guard: ExpressionKind = null,
    param: PatternKind = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (guard != null) __obj.updateDynamic("guard")(guard.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause]
  }
}

