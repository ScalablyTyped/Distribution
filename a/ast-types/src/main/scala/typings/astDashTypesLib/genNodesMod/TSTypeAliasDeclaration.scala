package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSTypeAliasDeclaration
  extends TSHasOptionalTypeParameters
     with ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
  var declare: scala.Boolean
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAliasDeclaration
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
}

object TSTypeAliasDeclaration {
  @scala.inline
  def apply(
    declare: scala.Boolean,
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAliasDeclaration,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("declare")(declare)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeAliasDeclaration]
  }
}

