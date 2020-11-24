package typings.astTypes.buildersMod

import typings.astTypes.anon.Children
import typings.astTypes.kindsMod.JSXClosingFragmentKind
import typings.astTypes.kindsMod.JSXElementKind
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXFragmentKind
import typings.astTypes.kindsMod.JSXOpeningFragmentKind
import typings.astTypes.kindsMod.JSXSpreadChildKind
import typings.astTypes.kindsMod.JSXTextKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.JSXFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXFragmentBuilder extends js.Object {
  
  def apply(openingFragment: JSXOpeningFragmentKind, closingFragment: JSXClosingFragmentKind): JSXFragment = js.native
  def apply(
    openingFragment: JSXOpeningFragmentKind,
    closingFragment: JSXClosingFragmentKind,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXFragment = js.native
  
  def from(params: Children): JSXFragment = js.native
}
