package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTypeReference
  extends TSHasOptionalTypeParameterInstantiation
     with ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeReference
  var typeName: IdentifierKind | TSQualifiedNameKind
}

object TSTypeReference {
  @scala.inline
  def apply(
    `type`: typings.astDashTypes.astDashTypesStrings.TSTypeReference,
    typeName: IdentifierKind | TSQualifiedNameKind,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeReference]
  }
}

