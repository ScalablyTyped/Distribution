package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TSExternalModuleReferenceKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdIsExport extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var isExport: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind
}

object Anon_CommentsIdIsExport {
  @scala.inline
  def apply(
    id: IdentifierKind,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind,
    comments: js.Array[CommentKind] = null,
    isExport: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): Anon_CommentsIdIsExport = {
    val __obj = js.Dynamic.literal(id = id, moduleReference = moduleReference.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(isExport)) __obj.updateDynamic("isExport")(isExport)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsIdIsExport]
  }
}

