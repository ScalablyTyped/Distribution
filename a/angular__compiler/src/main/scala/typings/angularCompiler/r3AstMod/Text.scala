package typings.angularCompiler.r3AstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Text")
@js.native
class Text protected () extends Node {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  var value: String = js.native
}

