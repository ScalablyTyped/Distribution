package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseError")
@js.native
class ParseError protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.ParseError {
  def this(span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String,
    level: ParseErrorLevel
  ) = this()
}

