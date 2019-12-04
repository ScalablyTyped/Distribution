package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.JSXAttributeKind
import typings.astDashTypes.genKindsMod.JSXClosingElementKind
import typings.astDashTypes.genKindsMod.JSXElementKind
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXFragmentKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXMemberExpressionKind
import typings.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typings.astDashTypes.genKindsMod.JSXOpeningElementKind
import typings.astDashTypes.genKindsMod.JSXSpreadAttributeKind
import typings.astDashTypes.genKindsMod.JSXTextKind
import typings.astDashTypes.genKindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXElement extends ASTNode {
  var attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]
  var children: js.Array[
    JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
  ]
  var closingElement: JSXClosingElementKind | Null
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
  var openingElement: JSXOpeningElementKind
  var selfClosing: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    openingElement: JSXOpeningElementKind,
    selfClosing: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.JSXElement,
    closingElement: JSXClosingElementKind = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement]
  }
}

