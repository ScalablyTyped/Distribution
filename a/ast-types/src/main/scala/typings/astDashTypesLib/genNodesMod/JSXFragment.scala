package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXFragment
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var children: js.Array[
    astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
  ]
  var closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind
  var openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXFragment
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ],
    closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind,
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.JSXFragment
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children, closingElement = closingElement, openingElement = openingElement)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSXFragment]
  }
}

