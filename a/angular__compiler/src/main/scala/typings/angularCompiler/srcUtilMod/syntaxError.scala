package typings.angularCompiler.srcUtilMod

import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", "syntaxError")
@js.native
object syntaxError extends js.Object {
  def apply(msg: String): Error = js.native
  def apply(msg: String, parseErrors: js.Array[ParseError]): Error = js.native
}

