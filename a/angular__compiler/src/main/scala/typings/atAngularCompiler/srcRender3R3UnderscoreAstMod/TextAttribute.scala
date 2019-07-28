package typings.atAngularCompiler.srcRender3R3UnderscoreAstMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "TextAttribute")
@js.native
class TextAttribute protected () extends Node {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  var name: String = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: String = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

