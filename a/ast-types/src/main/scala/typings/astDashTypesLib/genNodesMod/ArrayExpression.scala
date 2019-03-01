package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ArrayExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var elements: js.Array[
    astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind | astDashTypesLib.genKindsMod.RestElementKind | scala.Null
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ArrayExpression
}

object ArrayExpression {
  @scala.inline
  def apply(
    elements: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind | astDashTypesLib.genKindsMod.RestElementKind | scala.Null
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ArrayExpression
  ): ArrayExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("elements")(elements)
    __obj.asInstanceOf[ArrayExpression]
  }
}

