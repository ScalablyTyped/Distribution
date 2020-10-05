package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TemplateParseError")
@js.native
class TemplateParseError protected ()
  extends typings.angularCompiler.compilerMod.TemplateParseError {
  def this(
    message: String,
    span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    level: typings.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}

