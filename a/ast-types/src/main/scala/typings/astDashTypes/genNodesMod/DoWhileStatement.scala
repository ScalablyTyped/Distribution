package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DoWhileStatement extends ASTNode {
  var body: StatementKind
  var test: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    body: StatementKind,
    test: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.DoWhileStatement
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoWhileStatement]
  }
}

