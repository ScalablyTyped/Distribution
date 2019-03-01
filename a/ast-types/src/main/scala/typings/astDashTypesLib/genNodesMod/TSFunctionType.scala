package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSFunctionType
  extends TSHasOptionalTypeParameters
     with TSHasOptionalTypeAnnotation
     with ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var parameters: js.Array[
    astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSFunctionType
}

object TSFunctionType {
  @scala.inline
  def apply(
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSFunctionType,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): TSFunctionType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameters")(parameters)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSFunctionType]
  }
}

