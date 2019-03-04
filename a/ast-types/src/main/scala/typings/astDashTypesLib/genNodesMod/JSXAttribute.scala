package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXAttribute
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXAttribute
  var value: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | scala.Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.JSXAttribute,
    value: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}

