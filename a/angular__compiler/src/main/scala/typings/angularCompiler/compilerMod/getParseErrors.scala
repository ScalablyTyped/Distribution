package typings.angularCompiler.compilerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "getParseErrors")
@js.native
object getParseErrors extends js.Object {
  def apply(error: Error): js.Array[typings.angularCompiler.srcParseUtilMod.ParseError] = js.native
}

