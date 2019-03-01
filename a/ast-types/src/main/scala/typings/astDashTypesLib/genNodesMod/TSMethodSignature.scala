package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSMethodSignature
  extends TSHasOptionalTypeParameters
     with TSHasOptionalTypeAnnotation
     with ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
  var computed: scala.Boolean
  var key: astDashTypesLib.genKindsMod.ExpressionKind
  var optional: scala.Boolean
  var parameters: js.Array[
    astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSMethodSignature
}

object TSMethodSignature {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    optional: scala.Boolean,
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSMethodSignature,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): TSMethodSignature = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("parameters")(parameters)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSMethodSignature]
  }
}

