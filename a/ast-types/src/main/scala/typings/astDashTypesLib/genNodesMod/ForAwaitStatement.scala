package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait ForAwaitStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind
  var right: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ForAwaitStatement
}

object ForAwaitStatement {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ForAwaitStatement
  ): ForAwaitStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[ForAwaitStatement]
  }
}

