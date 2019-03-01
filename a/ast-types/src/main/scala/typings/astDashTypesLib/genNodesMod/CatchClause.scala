package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait CatchClause
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var guard: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var param: astDashTypesLib.genKindsMod.PatternKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.CatchClause,
    guard: astDashTypesLib.genKindsMod.ExpressionKind = null,
    param: astDashTypesLib.genKindsMod.PatternKind = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    if (guard != null) __obj.updateDynamic("guard")(guard)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[CatchClause]
  }
}

