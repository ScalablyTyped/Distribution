package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocTypeAnnotationArrayCommentKind extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
}

object Anon_CommentsLocTypeAnnotationArrayCommentKind {
  @scala.inline
  def apply(
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocTypeAnnotationArrayCommentKind = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocTypeAnnotationArrayCommentKind]
  }
}

