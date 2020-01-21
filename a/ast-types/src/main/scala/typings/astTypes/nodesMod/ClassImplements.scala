package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ClassImplements extends ASTNode {
  var id: IdentifierKind
  var superClass: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.ClassImplements
  var typeParameters: TypeParameterInstantiationKind | Null
}

object ClassImplements {
  @scala.inline
  def apply(
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.ClassImplements,
    superClass: ExpressionKind = null,
    typeParameters: TypeParameterInstantiationKind = null
  ): ClassImplements = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (superClass != null) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassImplements]
  }
}

