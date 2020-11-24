package typings.angularCompiler.compilerMod

import typings.angularCompiler.metaMod.I18nMeta
import typings.angularCompiler.outputAstMod.LiteralPiece
import typings.angularCompiler.outputAstMod.PlaceholderPiece
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "LocalizedString")
@js.native
class LocalizedString protected ()
  extends typings.angularCompiler.publicApiMod.LocalizedString {
  def this(
    metaBlock: I18nMeta,
    messageParts: js.Array[LiteralPiece],
    placeHolderNames: js.Array[PlaceholderPiece],
    expressions: js.Array[typings.angularCompiler.outputAstMod.Expression]
  ) = this()
  def this(
    metaBlock: I18nMeta,
    messageParts: js.Array[LiteralPiece],
    placeHolderNames: js.Array[PlaceholderPiece],
    expressions: js.Array[typings.angularCompiler.outputAstMod.Expression],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
