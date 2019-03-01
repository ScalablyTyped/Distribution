package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait InterfaceDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.InterfaceDeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind
  var `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind]
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.InterfaceDeclaration
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
}

object InterfaceDeclaration {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind,
    `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind],
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.InterfaceDeclaration,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind = null
  ): InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(`extends` = `extends`, `type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("id")(id)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[InterfaceDeclaration]
  }
}

