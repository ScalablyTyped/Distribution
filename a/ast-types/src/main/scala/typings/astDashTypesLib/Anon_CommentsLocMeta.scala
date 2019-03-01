package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocMeta extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var meta: astDashTypesLib.genKindsMod.IdentifierKind
  var property: astDashTypesLib.genKindsMod.IdentifierKind
}

object Anon_CommentsLocMeta {
  @scala.inline
  def apply(
    meta: astDashTypesLib.genKindsMod.IdentifierKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("property")(property)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocMeta]
  }
}

