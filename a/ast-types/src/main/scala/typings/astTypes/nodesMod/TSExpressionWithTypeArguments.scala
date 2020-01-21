package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSExpressionWithTypeArguments
  extends TSHasOptionalTypeParameterInstantiation
     with ASTNode {
  var expression: IdentifierKind | TSQualifiedNameKind
  var `type`: typings.astTypes.astTypesStrings.TSExpressionWithTypeArguments
}

object TSExpressionWithTypeArguments {
  @scala.inline
  def apply(
    expression: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSExpressionWithTypeArguments,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExpressionWithTypeArguments]
  }
}

