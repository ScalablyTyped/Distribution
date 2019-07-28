package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Children
import typings.astDashTypes.genKindsMod.JSXClosingFragmentKind
import typings.astDashTypes.genKindsMod.JSXElementKind
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXFragmentKind
import typings.astDashTypes.genKindsMod.JSXOpeningFragmentKind
import typings.astDashTypes.genKindsMod.JSXTextKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.JSXFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXFragmentBuilder extends js.Object {
  def apply(openingElement: JSXOpeningFragmentKind, closingElement: JSXClosingFragmentKind): JSXFragment = js.native
  def apply(
    openingElement: JSXOpeningFragmentKind,
    closingElement: JSXClosingFragmentKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXFragment = js.native
  def from(params: Anon_Children): JSXFragment = js.native
}

