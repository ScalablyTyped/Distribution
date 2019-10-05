package typings.atAngularCompiler.srcCompilerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "syntaxError")
@js.native
object syntaxError extends js.Object {
  def apply(msg: String): Error = js.native
  def apply(msg: String, parseErrors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]): Error = js.native
}

