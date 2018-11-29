package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Content")
@js.native
class Content protected () extends Node {
  def this(selectorIndex: scala.Double, attributes: js.Array[TextAttribute], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(selectorIndex: scala.Double, attributes: js.Array[TextAttribute], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(selectorIndex: scala.Double, attributes: js.Array[TextAttribute], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  var attributes: js.Array[TextAttribute] = js.native
  var i18n: js.UndefOr[
    atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message | atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node
  ] = js.native
  var selectorIndex: scala.Double = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

