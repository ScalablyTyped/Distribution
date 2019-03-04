package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DoWhileStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var test: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.DoWhileStatement
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body, test = test)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DoWhileStatement]
  }
}

