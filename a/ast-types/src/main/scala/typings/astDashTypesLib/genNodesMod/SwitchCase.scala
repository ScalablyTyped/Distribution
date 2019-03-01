package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait SwitchCase
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var consequent: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  var test: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[astDashTypesLib.genKindsMod.StatementKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.SwitchCase,
    test: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("consequent")(consequent)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[SwitchCase]
  }
}

