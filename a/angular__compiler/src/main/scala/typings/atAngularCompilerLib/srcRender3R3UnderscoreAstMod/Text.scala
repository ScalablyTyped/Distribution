package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Text")
@js.native
class Text protected () extends Node {
  def this(value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var value: java.lang.String = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

