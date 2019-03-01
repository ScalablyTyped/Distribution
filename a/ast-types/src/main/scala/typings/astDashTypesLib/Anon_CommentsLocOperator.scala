package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocOperator extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var operator: java.lang.String
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
}

object Anon_CommentsLocOperator {
  @scala.inline
  def apply(
    operator: java.lang.String,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocOperator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocOperator]
  }
}

