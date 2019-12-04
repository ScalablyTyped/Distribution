package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSExpressionWithTypeArgumentsKind
import typings.astDashTypes.genKindsMod.TSInterfaceBodyKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSInterfaceDeclaration
  extends TSHasOptionalTypeParameters
     with ASTNode {
  var body: TSInterfaceBodyKind
  var declare: Boolean
  var `extends`: js.Array[TSExpressionWithTypeArgumentsKind] | Null
  var id: IdentifierKind | TSQualifiedNameKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSInterfaceDeclaration
}

object TSInterfaceDeclaration {
  @scala.inline
  def apply(
    body: TSInterfaceBodyKind,
    declare: Boolean,
    id: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astDashTypes.astDashTypesStrings.TSInterfaceDeclaration,
    `extends`: js.Array[TSExpressionWithTypeArgumentsKind] = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInterfaceDeclaration]
  }
}

