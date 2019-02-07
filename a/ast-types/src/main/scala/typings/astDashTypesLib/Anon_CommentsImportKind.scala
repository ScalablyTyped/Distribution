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

