package typings.angularCompiler.providerAnalyzerMod

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/provider_analyzer", "ProviderViewContext")
@js.native
class ProviderViewContext protected () extends js.Object {
  def this(reflector: CompileReflector, component: CompileDirectiveMetadata) = this()
  var component: CompileDirectiveMetadata = js.native
  var errors: js.Array[ProviderError] = js.native
  var reflector: CompileReflector = js.native
}

