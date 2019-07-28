package typings.atAngularCompiler.srcRender3R3UnderscoreAstMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Content")
@js.native
class Content protected () extends Node {
  def this(selector: String, attributes: js.Array[TextAttribute], sourceSpan: ParseSourceSpan) = this()
  def this(selector: String, attributes: js.Array[TextAttribute], sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: ParseSourceSpan,
    i18n: typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var attributes: js.Array[TextAttribute] = js.native
  var i18n: js.UndefOr[Message | typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  var selector: String = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

