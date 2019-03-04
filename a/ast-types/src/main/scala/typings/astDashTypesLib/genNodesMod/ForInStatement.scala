package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ForInStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind
  var right: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ForInStatement
}

object ForInStatement {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ForInStatement
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body, left = left.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ForInStatement]
  }
}

