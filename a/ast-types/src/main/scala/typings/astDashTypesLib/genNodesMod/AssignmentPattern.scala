package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait AssignmentPattern
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var left: astDashTypesLib.genKindsMod.PatternKind
  var right: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    left: astDashTypesLib.genKindsMod.PatternKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.AssignmentPattern
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[AssignmentPattern]
  }
}

