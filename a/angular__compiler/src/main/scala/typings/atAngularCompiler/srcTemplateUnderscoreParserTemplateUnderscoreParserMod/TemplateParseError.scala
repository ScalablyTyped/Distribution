package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_parser", "TemplateParseError")
@js.native
class TemplateParseError protected () extends ParseError {
  def this(message: String, span: ParseSourceSpan, level: ParseErrorLevel) = this()
}

