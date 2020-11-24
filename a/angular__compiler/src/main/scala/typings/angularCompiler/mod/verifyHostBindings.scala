package typings.angularCompiler.mod

import typings.angularCompiler.viewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "verifyHostBindings")
@js.native
object verifyHostBindings extends js.Object {
  
  def apply(bindings: ParsedHostBindings, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan): js.Array[typings.angularCompiler.srcParseUtilMod.ParseError] = js.native
}
