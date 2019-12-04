package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TypeCastExpression extends ASTNode {
  var expression: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TypeCastExpression
  var typeAnnotation: TypeAnnotationKind
}

object TypeCastExpression {
  @scala.inline
  def apply(
    expression: ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCastExpression]
  }
}

