package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected ()
  extends typings.atAngularCompiler.srcCompilerMod.TmplAstBoundText {
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

