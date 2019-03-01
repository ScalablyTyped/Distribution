package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeIndexer
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var key: astDashTypesLib.genKindsMod.FlowTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeIndexer
  var value: astDashTypesLib.genKindsMod.FlowTypeKind
  var variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
}

object ObjectTypeIndexer {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    key: astDashTypesLib.genKindsMod.FlowTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeIndexer,
    value: astDashTypesLib.genKindsMod.FlowTypeKind,
    variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus = null
  ): ObjectTypeIndexer = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeIndexer]
  }
}

