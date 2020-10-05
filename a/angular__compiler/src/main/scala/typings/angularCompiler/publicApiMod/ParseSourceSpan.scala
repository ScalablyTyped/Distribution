package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ParseSourceSpan")
@js.native
class ParseSourceSpan protected ()
  extends typings.angularCompiler.srcCompilerMod.ParseSourceSpan {
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

