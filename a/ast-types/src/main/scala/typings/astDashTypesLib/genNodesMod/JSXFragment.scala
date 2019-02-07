package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXFragment extends js.Object {
  var children: js.Array[
    astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
  ]
  var closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind
  var openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXFragment
}

