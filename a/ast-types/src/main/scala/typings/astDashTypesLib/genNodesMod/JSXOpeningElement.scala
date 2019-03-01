package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXOpeningElement
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var attributes: js.Array[
    astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
  ]
  var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
  var selfClosing: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXOpeningElement
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[
      astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
    ],
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind,
    selfClosing: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.JSXOpeningElement
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("selfClosing")(selfClosing)
    __obj.asInstanceOf[JSXOpeningElement]
  }
}

