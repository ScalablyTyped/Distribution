package typings.angularCompiler.r3AstMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
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
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  var attributes: js.Array[TextAttribute] = js.native
  var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
  var selector: String = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

