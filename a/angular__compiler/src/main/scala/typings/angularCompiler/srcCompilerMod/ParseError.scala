package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParseError")
@js.native
class ParseError protected ()
  extends typings.angularCompiler.srcParseUtilMod.ParseError {
  def this(span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String,
    level: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

