package typings.angularCompiler.srcUtilMod

import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/util", "getParseErrors")
@js.native
object getParseErrors extends js.Object {
  
  def apply(error: Error): js.Array[ParseError] = js.native
}
