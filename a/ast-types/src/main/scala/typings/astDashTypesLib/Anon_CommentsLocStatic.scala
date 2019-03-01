package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocStatic extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var static: js.UndefOr[scala.Boolean] = js.undefined
  var value: astDashTypesLib.genKindsMod.FunctionTypeAnnotationKind
}

object Anon_CommentsLocStatic {
  @scala.inline
  def apply(
    value: astDashTypesLib.genKindsMod.FunctionTypeAnnotationKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    static: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CommentsLocStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[Anon_CommentsLocStatic]
  }
}

