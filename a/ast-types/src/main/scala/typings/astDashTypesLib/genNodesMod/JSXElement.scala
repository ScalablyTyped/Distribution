package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXElement
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var attributes: js.Array[
    astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
  ]
  var children: js.Array[
    astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
  ]
  var closingElement: astDashTypesLib.genKindsMod.JSXClosingElementKind | scala.Null
  var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
  var openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind
  var selfClosing: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    attributes: js.Array[
      astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
    ],
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ],
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind,
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    selfClosing: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.JSXElement,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingElementKind = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children, name = name.asInstanceOf[js.Any], openingElement = openingElement, selfClosing = selfClosing)
    __obj.updateDynamic("type")(`type`)
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement)
    __obj.asInstanceOf[JSXElement]
  }
}

