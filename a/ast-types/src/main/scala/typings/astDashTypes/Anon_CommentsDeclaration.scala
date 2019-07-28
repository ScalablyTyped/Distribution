package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.DeclareClassKind
import typings.astDashTypes.genKindsMod.DeclareFunctionKind
import typings.astDashTypes.genKindsMod.DeclareVariableKind
import typings.astDashTypes.genKindsMod.ExportBatchSpecifierKind
import typings.astDashTypes.genKindsMod.ExportSpecifierKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsDeclaration extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | Null
  var default: Boolean
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.undefined
}

object Anon_CommentsDeclaration {
  @scala.inline
  def apply(
    default: Boolean,
    comments: js.Array[CommentKind] = null,
    declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind] = null
  ): Anon_CommentsDeclaration = {
    val __obj = js.Dynamic.literal(default = default)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (source != null) __obj.updateDynamic("source")(source)
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers)
    __obj.asInstanceOf[Anon_CommentsDeclaration]
  }
}

