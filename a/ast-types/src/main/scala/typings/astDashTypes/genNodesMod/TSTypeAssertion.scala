package typings.astDashTypes.genNodesMod

import typings.astDashTypes.Anon_Parenthesized
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait TSTypeAssertion extends ASTNode {
  var expression: ExpressionKind
  var extra: Anon_Parenthesized | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeAssertion
  var typeAnnotation: TSTypeKind
}

object TSTypeAssertion {
  @scala.inline
  def apply(
    expression: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind,
    extra: Anon_Parenthesized = null
  ): TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAssertion]
  }
}

