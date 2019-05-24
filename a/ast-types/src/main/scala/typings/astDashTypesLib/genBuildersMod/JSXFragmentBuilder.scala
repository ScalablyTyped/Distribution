package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXFragmentBuilder extends js.Object {
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXFragment = js.native
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind,
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXFragment = js.native
  def from(params: astDashTypesLib.Anon_Children): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXFragment = js.native
}

