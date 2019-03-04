package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait ArrayPattern
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var elements: js.Array[
    astDashTypesLib.genKindsMod.PatternKind | astDashTypesLib.genKindsMod.SpreadElementKind | scala.Null
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ArrayPattern
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[
      astDashTypesLib.genKindsMod.PatternKind | astDashTypesLib.genKindsMod.SpreadElementKind | scala.Null
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ArrayPattern
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArrayPattern]
  }
}

