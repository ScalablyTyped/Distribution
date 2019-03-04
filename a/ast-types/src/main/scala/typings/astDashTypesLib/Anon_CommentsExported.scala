package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExported extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var exported: astDashTypesLib.genKindsMod.IdentifierKind
  var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var local: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  var name: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
}

object Anon_CommentsExported {
  @scala.inline
  def apply(
    exported: astDashTypesLib.genKindsMod.IdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    local: astDashTypesLib.genKindsMod.IdentifierKind = null,
    name: astDashTypesLib.genKindsMod.IdentifierKind = null
  ): Anon_CommentsExported = {
    val __obj = js.Dynamic.literal(exported = exported)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (local != null) __obj.updateDynamic("local")(local)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_CommentsExported]
  }
}

