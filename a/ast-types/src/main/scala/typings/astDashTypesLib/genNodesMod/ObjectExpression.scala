package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ObjectExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var properties: js.Array[
    astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.ObjectMethodKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.SpreadElementKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.ObjectMethodKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectExpression
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ObjectExpression]
  }
}

