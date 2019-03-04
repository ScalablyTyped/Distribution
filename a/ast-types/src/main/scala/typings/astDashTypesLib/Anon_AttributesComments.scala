package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesComments extends js.Object {
  var attributes: js.UndefOr[
    js.Array[
      astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
    ]
  ] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
  var selfClosing: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AttributesComments {
  @scala.inline
  def apply(
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind,
    attributes: js.Array[
      astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
    ] = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    selfClosing: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AttributesComments = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing)
    __obj.asInstanceOf[Anon_AttributesComments]
  }
}

