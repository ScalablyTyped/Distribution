package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeInternalSlot
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var method: scala.Boolean
  var optional: scala.Boolean
  var static: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeInternalSlot
  var value: astDashTypesLib.genKindsMod.FlowTypeKind
}

object ObjectTypeInternalSlot {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    method: scala.Boolean,
    optional: scala.Boolean,
    static: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeInternalSlot,
    value: astDashTypesLib.genKindsMod.FlowTypeKind
  ): ObjectTypeInternalSlot = {
    val __obj = js.Dynamic.literal(id = id, method = method, optional = optional, static = static, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ObjectTypeInternalSlot]
  }
}

