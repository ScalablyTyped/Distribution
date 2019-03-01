package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsImportKind extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var importKind: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.value | astDashTypesLib.astDashTypesLibStrings.`type`
  ] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var source: astDashTypesLib.genKindsMod.LiteralKind
  var specifiers: js.UndefOr[
    js.Array[
      astDashTypesLib.genKindsMod.ImportSpecifierKind | astDashTypesLib.genKindsMod.ImportNamespaceSpecifierKind | astDashTypesLib.genKindsMod.ImportDefaultSpecifierKind
    ]
  ] = js.undefined
}

object Anon_CommentsImportKind {
  @scala.inline
  def apply(
    source: astDashTypesLib.genKindsMod.LiteralKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    importKind: astDashTypesLib.astDashTypesLibStrings.value | astDashTypesLib.astDashTypesLibStrings.`type` = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    specifiers: js.Array[
      astDashTypesLib.genKindsMod.ImportSpecifierKind | astDashTypesLib.genKindsMod.ImportNamespaceSpecifierKind | astDashTypesLib.genKindsMod.ImportDefaultSpecifierKind
    ] = null
  ): Anon_CommentsImportKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (importKind != null) __obj.updateDynamic("importKind")(importKind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers)
    __obj.asInstanceOf[Anon_CommentsImportKind]
  }
}

