package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeProperty
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind
  var optional: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeProperty
  var value: astDashTypesLib.genKindsMod.FlowTypeKind
  var variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
}

object ObjectTypeProperty {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind,
    optional: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeProperty,
    value: astDashTypesLib.genKindsMod.FlowTypeKind,
    variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus = null
  ): ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional, value = value)
    __obj.updateDynamic("type")(`type`)
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty]
  }
}

