package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.MemberExpression, 'type'> ]: ast-types.ast-types/gen/nodes.MemberExpression[P]} */ trait OptionalMemberExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.MemberExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var optional: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.OptionalMemberExpression
}

object OptionalMemberExpression {
  @scala.inline
  def apply(optional: scala.Boolean, `type`: astDashTypesLib.astDashTypesLibStrings.OptionalMemberExpression): OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(optional = optional)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OptionalMemberExpression]
  }
}

