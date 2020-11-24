package typings.angularCompiler.providerAnalyzerMod

import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/provider_analyzer", "ProviderError")
@js.native
class ProviderError protected () extends ParseError {
  def this(message: String, span: ParseSourceSpan) = this()
}
