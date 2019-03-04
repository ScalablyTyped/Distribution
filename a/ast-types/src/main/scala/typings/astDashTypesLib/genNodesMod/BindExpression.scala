package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait BindExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var callee: astDashTypesLib.genKindsMod.ExpressionKind
  var `object`: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.BindExpression
}

object BindExpression {
  @scala.inline
  def apply(
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.BindExpression,
    `object`: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee)
    __obj.updateDynamic("type")(`type`)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[BindExpression]
  }
}

