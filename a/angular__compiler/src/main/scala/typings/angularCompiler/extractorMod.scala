package typings.angularCompiler

import typings.angularCompiler.messageBundleMod.MessageBundle
import typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolverHost
import typings.angularCompiler.summaryResolverMod.AotSummaryResolverHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractorMod {
  
  @JSImport("@angular/compiler/src/i18n/extractor", "Extractor")
  @js.native
  class Extractor protected () extends StObject {
    def this(
      host: ExtractorHost,
      staticSymbolResolver: StaticSymbolResolver,
      messageBundle: MessageBundle,
      metadataResolver: CompileMetadataResolver
    ) = this()
    
    def extract(rootFiles: js.Array[String]): js.Promise[MessageBundle] = js.native
    
    var host: ExtractorHost = js.native
    
    /* private */ var messageBundle: js.Any = js.native
    
    /* private */ var metadataResolver: js.Any = js.native
    
    /* private */ var staticSymbolResolver: js.Any = js.native
  }
  /* static members */
  object Extractor {
    
    @JSImport("@angular/compiler/src/i18n/extractor", "Extractor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(host: ExtractorHost): typings.angularCompiler.anon.Extractor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.anon.Extractor]
    inline def create(host: ExtractorHost, locale: String): typings.angularCompiler.anon.Extractor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(host.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.anon.Extractor]
  }
  
  @js.native
  trait ExtractorHost
    extends StObject
       with StaticSymbolResolverHost
       with AotSummaryResolverHost {
    
    /**
      * Loads a resource (e.g. html / css)
      */
    def loadResource(path: String): js.Promise[String] | String = js.native
    
    /**
      * Converts a path that refers to a resource into an absolute filePath
      * that can be lateron used for loading the resource via `loadResource.
      */
    def resourceNameToFileName(path: String, containingFile: String): String | Null = js.native
  }
}
