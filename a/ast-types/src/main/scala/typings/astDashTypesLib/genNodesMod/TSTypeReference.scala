package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTypeReference
  extends TSHasOptionalTypeParameterInstantiation
     with ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParameterInstantiationKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeReference
  var typeName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
}

object TSTypeReference {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeReference,
    typeName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null
  ): TSTypeReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeReference]
  }
}

