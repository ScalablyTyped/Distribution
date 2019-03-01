package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TSTypeAssertion
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var expression: astDashTypesLib.genKindsMod.ExpressionKind
  var extra: astDashTypesLib.Anon_Parenthesized | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAssertion
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
}

object TSTypeAssertion {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAssertion,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind,
    extra: astDashTypesLib.Anon_Parenthesized = null
  ): TSTypeAssertion = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    __obj.asInstanceOf[TSTypeAssertion]
  }
}

