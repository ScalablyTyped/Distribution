package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.JSXAttributeKind
import typings.astDashTypes.genKindsMod.JSXClosingElementKind
import typings.astDashTypes.genKindsMod.JSXElementKind
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXFragmentKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXMemberExpressionKind
import typings.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typings.astDashTypes.genKindsMod.JSXOpeningElementKind
import typings.astDashTypes.genKindsMod.JSXSpreadAttributeKind
import typings.astDashTypes.genKindsMod.JSXTextKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.undefined
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.undefined
  var closingElement: js.UndefOr[JSXClosingElementKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: js.UndefOr[JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind] = js.undefined
  var openingElement: JSXOpeningElementKind
  var selfClosing: js.UndefOr[Boolean] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    openingElement: JSXOpeningElementKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind] = null,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ] = null,
    closingElement: JSXClosingElementKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind = null,
    selfClosing: js.UndefOr[Boolean] = js.undefined
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes]
  }
}

