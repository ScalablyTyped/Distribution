package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.JSXIdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocNameNamespace extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: JSXIdentifierKind
  var namespace: JSXIdentifierKind
}

object Anon_CommentsLocNameNamespace {
  @scala.inline
  def apply(
    name: JSXIdentifierKind,
    namespace: JSXIdentifierKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsLocNameNamespace = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocNameNamespace]
  }
}

