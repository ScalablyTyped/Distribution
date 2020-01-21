package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait InterfaceDeclaration extends ASTNode {
  var body: ObjectTypeAnnotationKind
  var `extends`: js.Array[InterfaceExtendsKind]
  var id: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.InterfaceDeclaration
  var typeParameters: TypeParameterDeclarationKind | Null
}

object InterfaceDeclaration {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.InterfaceDeclaration,
    typeParameters: TypeParameterDeclarationKind = null
  ): InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDeclaration]
  }
}

