package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait WhileStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var test: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.WhileStatement
}

object WhileStatement {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.WhileStatement
  ): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body, test = test)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WhileStatement]
  }
}

