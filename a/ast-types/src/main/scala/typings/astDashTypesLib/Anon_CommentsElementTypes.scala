package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsElementTypes extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var elementTypes: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsElementTypes {
  @scala.inline
  def apply(
    elementTypes: js.Array[astDashTypesLib.genKindsMod.TSTypeKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsElementTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elementTypes")(elementTypes)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsElementTypes]
  }
}

