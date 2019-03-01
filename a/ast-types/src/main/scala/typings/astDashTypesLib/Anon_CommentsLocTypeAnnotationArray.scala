package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocTypeAnnotationArray extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind
}

object Anon_CommentsLocTypeAnnotationArray {
  @scala.inline
  def apply(
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocTypeAnnotationArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocTypeAnnotationArray]
  }
}

