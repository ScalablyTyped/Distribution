package typings.angularCompiler.compilerMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected ()
  extends typings.angularCompiler.publicApiMod.TmplAstBoundText {
  def this(
    value: typings.angularCompiler.astMod.AST,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: typings.angularCompiler.astMod.AST,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: typings.angularCompiler.astMod.AST,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

