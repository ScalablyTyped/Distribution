package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.`type`
import typings.astDashTypes.astDashTypesStrings.value
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ImportDefaultSpecifierKind
import typings.astDashTypes.genKindsMod.ImportNamespaceSpecifierKind
import typings.astDashTypes.genKindsMod.ImportSpecifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsImportKind extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var importKind: js.UndefOr[value | `type`] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: LiteralKind
  var specifiers: js.UndefOr[
    js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  ] = js.undefined
}

object Anon_CommentsImportKind {
  @scala.inline
  def apply(
    source: LiteralKind,
    comments: js.Array[CommentKind] = null,
    importKind: value | `type` = null,
    loc: SourceLocationKind = null,
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind] = null
  ): Anon_CommentsImportKind = {
    val __obj = js.Dynamic.literal(source = source)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (importKind != null) __obj.updateDynamic("importKind")(importKind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers)
    __obj.asInstanceOf[Anon_CommentsImportKind]
  }
}

