package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSTypeAliasDeclaration
  extends TSHasOptionalTypeParameters
     with ASTNode {
  var declare: Boolean
  var id: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.TSTypeAliasDeclaration
  var typeAnnotation: TSTypeKind
}

object TSTypeAliasDeclaration {
  @scala.inline
  def apply(
    declare: Boolean,
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSTypeKind,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAliasDeclaration]
  }
}

