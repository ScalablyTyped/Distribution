package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocName extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: JSXIdentifierKind | JSXNamespacedNameKind
  var value: js.UndefOr[LiteralKind | JSXExpressionContainerKind | Null] = js.undefined
}

object Anon_CommentsLocName {
  @scala.inline
  def apply(
    name: JSXIdentifierKind | JSXNamespacedNameKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    value: LiteralKind | JSXExpressionContainerKind = null
  ): Anon_CommentsLocName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsLocName]
  }
}

