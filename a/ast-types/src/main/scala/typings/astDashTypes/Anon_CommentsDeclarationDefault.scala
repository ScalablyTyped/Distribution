package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExportBatchSpecifierKind
import typings.astDashTypes.genKindsMod.ExportSpecifierKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsDeclarationDefault extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declaration: DeclarationKind | ExpressionKind | Null
  var default: Boolean
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.undefined
}

object Anon_CommentsDeclarationDefault {
  @scala.inline
  def apply(
    default: Boolean,
    comments: js.Array[CommentKind] = null,
    declaration: DeclarationKind | ExpressionKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind] = null
  ): Anon_CommentsDeclarationDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsDeclarationDefault]
  }
}

