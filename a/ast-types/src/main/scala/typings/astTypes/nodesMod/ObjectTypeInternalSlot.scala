package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeInternalSlot extends ASTNode {
  var id: IdentifierKind
  var method: Boolean
  var optional: Boolean
  var static: Boolean
  var `type`: typings.astTypes.astTypesStrings.ObjectTypeInternalSlot
  var value: FlowTypeKind
}

object ObjectTypeInternalSlot {
  @scala.inline
  def apply(
    id: IdentifierKind,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeInternalSlot,
    value: FlowTypeKind
  ): ObjectTypeInternalSlot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeInternalSlot]
  }
}

