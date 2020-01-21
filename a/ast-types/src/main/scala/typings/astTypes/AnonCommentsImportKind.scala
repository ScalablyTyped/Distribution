package typings.astTypes

import typings.astTypes.astTypesStrings.`type`
import typings.astTypes.astTypesStrings.value
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ImportDefaultSpecifierKind
import typings.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typings.astTypes.kindsMod.ImportSpecifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsImportKind extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var importKind: js.UndefOr[value | `type`] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: LiteralKind
  var specifiers: js.UndefOr[
    js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  ] = js.undefined
}

object AnonCommentsImportKind {
  @scala.inline
  def apply(
    source: LiteralKind,
    comments: js.Array[CommentKind] = null,
    importKind: value | `type` = null,
    loc: SourceLocationKind = null,
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind] = null
  ): AnonCommentsImportKind = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (importKind != null) __obj.updateDynamic("importKind")(importKind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsImportKind]
  }
}

