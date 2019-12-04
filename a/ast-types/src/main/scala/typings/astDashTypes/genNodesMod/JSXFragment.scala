package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.JSXClosingFragmentKind
import typings.astDashTypes.genKindsMod.JSXElementKind
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXFragmentKind
import typings.astDashTypes.genKindsMod.JSXOpeningFragmentKind
import typings.astDashTypes.genKindsMod.JSXTextKind
import typings.astDashTypes.genKindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXFragment extends ASTNode {
  var children: js.Array[
    JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
  ]
  var closingElement: JSXClosingFragmentKind
  var openingElement: JSXOpeningFragmentKind
  var `type`: typings.astDashTypes.astDashTypesStrings.JSXFragment
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    closingElement: JSXClosingFragmentKind,
    openingElement: JSXOpeningFragmentKind,
    `type`: typings.astDashTypes.astDashTypesStrings.JSXFragment
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment]
  }
}

