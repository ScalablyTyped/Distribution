package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXElementBuilder extends js.Object {
  def apply(openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind): astDashTypesLib.genNodesMod.JSXElement = js.native
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingElementKind
  ): astDashTypesLib.genNodesMod.JSXElement = js.native
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingElementKind,
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ]
  ): astDashTypesLib.genNodesMod.JSXElement = js.native
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    closingElement: scala.Null,
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ]
  ): astDashTypesLib.genNodesMod.JSXElement = js.native
  def from(params: astDashTypesLib.Anon_Attributes): astDashTypesLib.genNodesMod.JSXElement = js.native
}

