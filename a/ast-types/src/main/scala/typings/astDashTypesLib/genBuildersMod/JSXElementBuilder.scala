package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXElementBuilder extends js.Object {
  def apply(openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement = js.native
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingElementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement = js.native
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingElementKind,
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement = js.native
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    closingElement: scala.Null,
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ]
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement = js.native
  def from(params: astDashTypesLib.Anon_Attributes): astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement = js.native
}

