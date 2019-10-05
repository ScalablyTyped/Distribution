package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseError")
@js.native
class ParseError protected ()
  extends typings.atAngularCompiler.srcCompilerMod.ParseError {
  def this(span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String,
    level: ParseErrorLevel
  ) = this()
}

