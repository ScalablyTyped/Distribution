package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ConditionalExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var alternate: astDashTypesLib.genKindsMod.ExpressionKind
  var consequent: astDashTypesLib.genKindsMod.ExpressionKind
  var test: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ConditionalExpression
}

object ConditionalExpression {
  @scala.inline
  def apply(
    alternate: astDashTypesLib.genKindsMod.ExpressionKind,
    consequent: astDashTypesLib.genKindsMod.ExpressionKind,
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ConditionalExpression
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate, consequent = consequent, test = test)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConditionalExpression]
  }
}

