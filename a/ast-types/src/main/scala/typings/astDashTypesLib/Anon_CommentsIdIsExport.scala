package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdIsExport extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var isExport: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var moduleReference: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind
}

object Anon_CommentsIdIsExport {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    moduleReference: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    isExport: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsIdIsExport = {
    val __obj = js.Dynamic.literal(id = id, moduleReference = moduleReference.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(isExport)) __obj.updateDynamic("isExport")(isExport)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsIdIsExport]
  }
}

