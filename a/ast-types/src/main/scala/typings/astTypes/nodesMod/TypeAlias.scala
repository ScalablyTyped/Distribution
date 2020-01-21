package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TypeAlias extends ASTNode {
  var id: IdentifierKind
  var right: FlowTypeKind
  var `type`: typings.astTypes.astTypesStrings.TypeAlias
  var typeParameters: TypeParameterDeclarationKind | Null
}

object TypeAlias {
  @scala.inline
  def apply(
    id: IdentifierKind,
    right: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.TypeAlias,
    typeParameters: TypeParameterDeclarationKind = null
  ): TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAlias]
  }
}

