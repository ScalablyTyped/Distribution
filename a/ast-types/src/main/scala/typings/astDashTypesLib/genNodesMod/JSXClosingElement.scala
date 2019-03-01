package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXClosingElement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXClosingElement
}

object JSXClosingElement {
  @scala.inline
  def apply(
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.JSXClosingElement
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement]
  }
}

