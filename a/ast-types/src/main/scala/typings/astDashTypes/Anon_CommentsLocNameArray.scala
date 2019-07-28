package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.JSXMemberExpressionKind
import typings.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocNameArray extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
}

object Anon_CommentsLocNameArray {
  @scala.inline
  def apply(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsLocNameArray = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocNameArray]
  }
}

