package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.CallExpression, 'type'> ]: ast-types.ast-types/gen/nodes.CallExpression[P]} */ trait OptionalCallExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.CallExpressionKind
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var optional: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.OptionalCallExpression
}

object OptionalCallExpression {
  @scala.inline
  def apply(optional: scala.Boolean, `type`: astDashTypesLib.astDashTypesLibStrings.OptionalCallExpression): OptionalCallExpression = {
    val __obj = js.Dynamic.literal(optional = optional)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OptionalCallExpression]
  }
}

