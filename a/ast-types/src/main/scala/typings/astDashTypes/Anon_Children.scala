package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.JSXClosingFragmentKind
import typings.astDashTypes.genKindsMod.JSXElementKind
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXFragmentKind
import typings.astDashTypes.genKindsMod.JSXOpeningFragmentKind
import typings.astDashTypes.genKindsMod.JSXTextKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.undefined
  var closingElement: JSXClosingFragmentKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var openingElement: JSXOpeningFragmentKind
}

object Anon_Children {
  @scala.inline
  def apply(
    closingElement: JSXClosingFragmentKind,
    openingElement: JSXOpeningFragmentKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ] = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(closingElement = closingElement.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

