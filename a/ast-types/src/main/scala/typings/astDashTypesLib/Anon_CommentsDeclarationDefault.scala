package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsDeclarationDefault extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var declaration: astDashTypesLib.genKindsMod.DeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var default: scala.Boolean
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var source: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
  var specifiers: js.UndefOr[
    js.Array[
      astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
    ]
  ] = js.undefined
}

object Anon_CommentsDeclarationDefault {
  @scala.inline
  def apply(
    default: scala.Boolean,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    declaration: astDashTypesLib.genKindsMod.DeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    source: astDashTypesLib.genKindsMod.LiteralKind = null,
    specifiers: js.Array[
      astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
    ] = null
  ): Anon_CommentsDeclarationDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("default")(default)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (source != null) __obj.updateDynamic("source")(source)
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers)
    __obj.asInstanceOf[Anon_CommentsDeclarationDefault]
  }
}

