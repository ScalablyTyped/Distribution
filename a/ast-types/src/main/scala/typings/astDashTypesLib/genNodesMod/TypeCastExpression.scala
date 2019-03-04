package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TypeCastExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var expression: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TypeCastExpression
  var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
}

object TypeCastExpression {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TypeCastExpression,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypeCastExpression]
  }
}

