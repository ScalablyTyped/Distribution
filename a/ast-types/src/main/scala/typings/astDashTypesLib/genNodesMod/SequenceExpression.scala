package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait SequenceExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.SequenceExpression
}

object SequenceExpression {
  @scala.inline
  def apply(
    expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.SequenceExpression
  ): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SequenceExpression]
  }
}

