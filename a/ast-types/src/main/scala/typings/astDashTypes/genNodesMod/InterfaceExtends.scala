package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait InterfaceExtends extends ASTNode {
  var id: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.InterfaceExtends
  var typeParameters: TypeParameterInstantiationKind | Null
}

object InterfaceExtends {
  @scala.inline
  def apply(
    id: IdentifierKind,
    `type`: typings.astDashTypes.astDashTypesStrings.InterfaceExtends,
    typeParameters: TypeParameterInstantiationKind = null
  ): InterfaceExtends = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceExtends]
  }
}

