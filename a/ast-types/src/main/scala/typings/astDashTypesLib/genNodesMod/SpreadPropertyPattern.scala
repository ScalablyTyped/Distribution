package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait SpreadPropertyPattern
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var argument: astDashTypesLib.genKindsMod.PatternKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.SpreadPropertyPattern
}

object SpreadPropertyPattern {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.PatternKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.SpreadPropertyPattern
  ): SpreadPropertyPattern = {
    val __obj = js.Dynamic.literal(argument = argument)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpreadPropertyPattern]
  }
}

