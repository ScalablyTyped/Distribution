package typings.astTypes.buildersMod

import typings.astTypes.anon.Attributes
import typings.astTypes.kindsMod.JSXClosingElementKind
import typings.astTypes.kindsMod.JSXElementKind
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXFragmentKind
import typings.astTypes.kindsMod.JSXOpeningElementKind
import typings.astTypes.kindsMod.JSXSpreadChildKind
import typings.astTypes.kindsMod.JSXTextKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.JSXElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXElementBuilder extends js.Object {
  
  def apply(openingElement: JSXOpeningElementKind): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElementKind,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElementKind,
    closingElement: Null,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement = js.native
  def apply(openingElement: JSXOpeningElementKind, closingElement: JSXClosingElementKind): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElementKind,
    closingElement: JSXClosingElementKind,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement = js.native
  
  def from(params: Attributes): JSXElement = js.native
}
