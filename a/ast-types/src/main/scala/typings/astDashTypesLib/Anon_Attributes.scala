package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[
    js.Array[
      astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
    ]
  ] = js.undefined
  var children: js.UndefOr[
    js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ]
  ] = js.undefined
  var closingElement: js.UndefOr[astDashTypesLib.genKindsMod.JSXClosingElementKind | scala.Null] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var name: js.UndefOr[
    astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
  ] = js.undefined
  var openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind
  var selfClosing: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind,
    attributes: js.Array[
      astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
    ] = null,
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ] = null,
    closingElement: astDashTypesLib.genKindsMod.JSXClosingElementKind = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind = null,
    selfClosing: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openingElement")(openingElement)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (children != null) __obj.updateDynamic("children")(children)
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

