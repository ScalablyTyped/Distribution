package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ParseError")
@js.native
class ParseError protected ()
  extends typings.angularCompiler.srcCompilerMod.ParseError {
  def this(span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String,
    level: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

