package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait CallExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.CallExpressionKind
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var arguments: js.Array[
    astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
  ]
  var callee: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.CallExpression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ],
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.CallExpression
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallExpression]
  }
}

