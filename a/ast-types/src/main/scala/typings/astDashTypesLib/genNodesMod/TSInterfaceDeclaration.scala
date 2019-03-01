package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSInterfaceDeclaration
  extends TSHasOptionalTypeParameters
     with ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
  var body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind
  var declare: scala.Boolean
  var `extends`: js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind] | scala.Null
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSInterfaceDeclaration
}

object TSInterfaceDeclaration {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind,
    declare: scala.Boolean,
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSInterfaceDeclaration,
    `extends`: js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind] = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("declare")(declare)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSInterfaceDeclaration]
  }
}

