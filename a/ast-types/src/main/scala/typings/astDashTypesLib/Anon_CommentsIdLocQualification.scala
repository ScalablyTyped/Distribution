package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdLocQualification extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var qualification: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
}

object Anon_CommentsIdLocQualification {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    qualification: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsIdLocQualification = {
    val __obj = js.Dynamic.literal(id = id, qualification = qualification.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsIdLocQualification]
  }
}

