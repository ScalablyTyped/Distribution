package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ClassExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var body: astDashTypesLib.genKindsMod.ClassBodyKind
  var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var implements: js.Array[astDashTypesLib.genKindsMod.ClassImplementsKind] | js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind]
  var superClass: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var superTypeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassExpression
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
}

object ClassExpression {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    implements: js.Array[astDashTypesLib.genKindsMod.ClassImplementsKind] | js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.ClassExpression,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind = null,
    superTypeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression]
  }
}

