package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected () extends BoundText {
  def this(
    value: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

