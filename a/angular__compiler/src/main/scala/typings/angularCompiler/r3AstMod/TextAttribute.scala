package typings.angularCompiler.r3AstMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
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
    i18n: typings.angularCompiler.i18nAstMod.Node
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
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
  var name: String = js.native
  var value: String = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}

