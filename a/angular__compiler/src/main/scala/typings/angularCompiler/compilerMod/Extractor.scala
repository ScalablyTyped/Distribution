package typings.angularCompiler.compilerMod

import typings.angularCompiler.extractorMod.ExtractorHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typings.angularCompiler.publicApiMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typings.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}
/* static members */
object Extractor {
  
  @JSImport("@angular/compiler/compiler", "Extractor.create")
  @js.native
  def create(host: ExtractorHost): typings.angularCompiler.anon.Extractor = js.native
  @JSImport("@angular/compiler/compiler", "Extractor.create")
  @js.native
  def create(host: ExtractorHost, locale: String): typings.angularCompiler.anon.Extractor = js.native
}
