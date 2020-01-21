package typings.angularCompiler.r3AstMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundText")
@js.native
class BoundText protected () extends Node {
  def this(value: AST, sourceSpan: ParseSourceSpan) = this()
  def this(value: AST, sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(value: AST, sourceSpan: ParseSourceSpan, i18n: typings.angularCompiler.i18nAstMod.Node) = this()
  var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: AST = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

