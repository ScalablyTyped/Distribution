package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.VariableDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ForStatement extends ASTNode {
  var body: StatementKind
  var init: VariableDeclarationKind | ExpressionKind | Null
  var test: ExpressionKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.ForStatement
  var update: ExpressionKind | Null
}

object ForStatement {
  @scala.inline
  def apply(
    body: StatementKind,
    `type`: typings.astDashTypes.astDashTypesStrings.ForStatement,
    init: VariableDeclarationKind | ExpressionKind = null,
    test: ExpressionKind = null,
    update: ExpressionKind = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
}

