package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParseError")
@js.native
class ParseError protected ()
  extends typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError {
  def this(span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String,
    level: ParseErrorLevel
  ) = this()
}

