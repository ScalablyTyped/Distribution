package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ForStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var init: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var test: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ForStatement
  var update: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
}

object ForStatement {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ForStatement,
    init: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind = null,
    test: astDashTypesLib.genKindsMod.ExpressionKind = null,
    update: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ForStatement]
  }
}

