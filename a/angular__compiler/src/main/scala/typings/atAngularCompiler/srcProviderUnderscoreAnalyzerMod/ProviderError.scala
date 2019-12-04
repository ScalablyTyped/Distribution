package typings.atAngularCompiler.srcProviderUnderscoreAnalyzerMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/provider_analyzer", "ProviderError")
@js.native
class ProviderError protected () extends ParseError {
  def this(message: String, span: ParseSourceSpan) = this()
}

