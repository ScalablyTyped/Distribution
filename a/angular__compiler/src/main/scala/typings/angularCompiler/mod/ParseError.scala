package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseError")
@js.native
class ParseError protected ()
  extends typings.angularCompiler.publicApiMod.ParseError {
  def this(span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String,
    level: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

