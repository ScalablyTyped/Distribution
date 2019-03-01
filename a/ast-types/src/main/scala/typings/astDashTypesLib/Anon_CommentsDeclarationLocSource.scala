package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsDeclarationLocSource extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var declaration: astDashTypesLib.genKindsMod.DeclarationKind | scala.Null
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var source: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
  var specifiers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind]] = js.undefined
}

object Anon_CommentsDeclarationLocSource {
  @scala.inline
  def apply(
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    declaration: astDashTypesLib.genKindsMod.DeclarationKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    source: astDashTypesLib.genKindsMod.LiteralKind = null,
    specifiers: js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind] = null
  ): Anon_CommentsDeclarationLocSource = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (source != null) __obj.updateDynamic("source")(source)
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers)
    __obj.asInstanceOf[Anon_CommentsDeclarationLocSource]
  }
}

