package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait YieldExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var delegate: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    delegate: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.YieldExpression,
    argument: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate)
    __obj.updateDynamic("type")(`type`)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    __obj.asInstanceOf[YieldExpression]
  }
}

