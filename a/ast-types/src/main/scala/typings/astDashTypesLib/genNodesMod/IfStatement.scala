package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait IfStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var alternate: astDashTypesLib.genKindsMod.StatementKind | scala.Null
  var consequent: astDashTypesLib.genKindsMod.StatementKind
  var test: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: astDashTypesLib.genKindsMod.StatementKind,
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.IfStatement,
    alternate: astDashTypesLib.genKindsMod.StatementKind = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent, test = test)
    __obj.updateDynamic("type")(`type`)
    if (alternate != null) __obj.updateDynamic("alternate")(alternate)
    __obj.asInstanceOf[IfStatement]
  }
}

