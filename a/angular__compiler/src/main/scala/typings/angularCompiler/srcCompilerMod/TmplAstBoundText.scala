package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import typings.angularCompiler.r3AstMod.BoundText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected () extends BoundText {
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

