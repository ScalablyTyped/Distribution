package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateParseError")
@js.native
class TemplateParseError protected ()
  extends typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParseError {
  def this(
    message: String,
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    level: ParseErrorLevel
  ) = this()
}

