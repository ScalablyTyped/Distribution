package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateParseError")
@js.native
class TemplateParseError protected ()
  extends typings.angularCompiler.srcCompilerMod.TemplateParseError {
  def this(
    message: String,
    span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    level: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

