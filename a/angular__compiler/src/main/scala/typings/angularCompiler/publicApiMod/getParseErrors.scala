package typings.angularCompiler.publicApiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "getParseErrors")
@js.native
object getParseErrors extends js.Object {
  def apply(error: Error): js.Array[typings.angularCompiler.srcParseUtilMod.ParseError] = js.native
}

