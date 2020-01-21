package typings.angularCompiler.publicApiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "syntaxError")
@js.native
object syntaxError extends js.Object {
  def apply(msg: String): Error = js.native
  def apply(msg: String, parseErrors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]): Error = js.native
}

