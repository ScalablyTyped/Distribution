package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateParseError")
@js.native
class TemplateParseError protected ()
  extends typings.atAngularCompiler.srcCompilerMod.TemplateParseError {
  def this(
    message: String,
    span: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    level: ParseErrorLevel
  ) = this()
}

