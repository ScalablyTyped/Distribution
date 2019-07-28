package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocTypeAnnotationArrayCommentKindNull extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeAnnotation: TSTypeKind
}

object Anon_CommentsLocTypeAnnotationArrayCommentKindNull {
  @scala.inline
  def apply(typeAnnotation: TSTypeKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): Anon_CommentsLocTypeAnnotationArrayCommentKindNull = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocTypeAnnotationArrayCommentKindNull]
  }
}

