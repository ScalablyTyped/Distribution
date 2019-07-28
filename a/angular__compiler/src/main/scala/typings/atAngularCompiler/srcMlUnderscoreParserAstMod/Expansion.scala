package typings.atAngularCompiler.srcMlUnderscoreParserAstMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Expansion")
@js.native
class Expansion protected () extends Node {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[ExpansionCase],
    sourceSpan: ParseSourceSpan,
    switchValueSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[ExpansionCase],
    sourceSpan: ParseSourceSpan,
    switchValueSourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[ExpansionCase],
    sourceSpan: ParseSourceSpan,
    switchValueSourceSpan: ParseSourceSpan,
    i18n: typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var cases: js.Array[ExpansionCase] = js.native
  var i18n: js.UndefOr[Message | typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var switchValue: String = js.native
  var switchValueSourceSpan: ParseSourceSpan = js.native
  var `type`: String = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

