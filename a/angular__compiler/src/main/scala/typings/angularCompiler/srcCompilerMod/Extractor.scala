package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.extractorMod.ExtractorHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typings.angularCompiler.i18nMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typings.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}
/* static members */
object Extractor {
  
  @JSImport("@angular/compiler/src/compiler", "Extractor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(host: ExtractorHost): typings.angularCompiler.anon.Extractor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.anon.Extractor]
  inline def create(host: ExtractorHost, locale: String): typings.angularCompiler.anon.Extractor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.anon.Extractor]
}
