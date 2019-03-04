package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait MemberExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.MemberExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var computed: scala.Boolean
  var `object`: astDashTypesLib.genKindsMod.ExpressionKind
  var property: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.MemberExpression
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed, property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemberExpression]
  }
}

