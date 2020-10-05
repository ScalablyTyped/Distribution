package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ParseSourceSpan")
@js.native
class ParseSourceSpan protected ()
  extends typings.angularCompiler.publicApiMod.ParseSourceSpan {
  def this(
    start: typings.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typings.angularCompiler.srcParseUtilMod.ParseLocation
  ) = this()
  def this(
    start: typings.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typings.angularCompiler.srcParseUtilMod.ParseLocation,
    details: String
  ) = this()
}

