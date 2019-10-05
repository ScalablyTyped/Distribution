package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Attributes
import typings.astDashTypes.genKindsMod.JSXClosingElementKind
import typings.astDashTypes.genKindsMod.JSXElementKind
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXFragmentKind
import typings.astDashTypes.genKindsMod.JSXOpeningElementKind
import typings.astDashTypes.genKindsMod.JSXTextKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXElementBuilder extends js.Object {
  def apply(openingElement: JSXOpeningElementKind): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElementKind,
    closingElement: Null,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXElement = js.native
  def apply(openingElement: JSXOpeningElementKind, closingElement: JSXClosingElementKind): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElementKind,
    closingElement: JSXClosingElementKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXElement = js.native
  def from(params: Anon_Attributes): JSXElement = js.native
}

