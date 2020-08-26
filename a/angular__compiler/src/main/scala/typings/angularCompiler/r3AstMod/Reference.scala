package typings.angularCompiler.r3AstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Reference")
@js.native
class Reference protected () extends Node {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var value: String = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}

