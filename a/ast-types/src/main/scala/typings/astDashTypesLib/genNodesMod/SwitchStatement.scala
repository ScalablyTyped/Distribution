package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait SwitchStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind]
  var discriminant: astDashTypesLib.genKindsMod.ExpressionKind
  var lexical: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.SwitchStatement
}

object SwitchStatement {
  @scala.inline
  def apply(
    cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind],
    discriminant: astDashTypesLib.genKindsMod.ExpressionKind,
    lexical: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.SwitchStatement
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases, discriminant = discriminant, lexical = lexical)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SwitchStatement]
  }
}

