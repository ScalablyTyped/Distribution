package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait TSExportAssignment
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var expression: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSExportAssignment
}

object TSExportAssignment {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSExportAssignment
  ): TSExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSExportAssignment]
  }
}

