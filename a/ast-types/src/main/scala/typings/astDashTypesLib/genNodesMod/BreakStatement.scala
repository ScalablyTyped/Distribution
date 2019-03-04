package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait BreakStatement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var label: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.BreakStatement,
    label: astDashTypesLib.genKindsMod.IdentifierKind = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[BreakStatement]
  }
}

