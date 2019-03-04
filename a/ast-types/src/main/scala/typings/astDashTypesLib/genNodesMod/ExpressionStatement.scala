package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ExpressionStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var expression: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExpressionStatement
}

object ExpressionStatement {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ExpressionStatement
  ): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExpressionStatement]
  }
}

