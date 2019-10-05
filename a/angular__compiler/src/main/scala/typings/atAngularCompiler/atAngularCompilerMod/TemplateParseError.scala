package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateParseError")
@js.native
class TemplateParseError protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.TemplateParseError {
  def this(
    message: String,
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    level: ParseErrorLevel
  ) = this()
}

