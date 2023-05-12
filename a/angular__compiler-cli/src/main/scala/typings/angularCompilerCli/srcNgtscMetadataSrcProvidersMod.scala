package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcProvidersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/providers", "ExportedProviderStatusResolver")
  @js.native
  open class ExportedProviderStatusResolver protected () extends StObject {
    def this(metaReader: MetadataReader) = this()
    
    /**
      * `ClassDeclaration`s that we are in the process of determining the provider status for.
      *
      * This is used to detect cycles in the import graph and avoid getting stuck in them.
      */
    /* private */ var calculating: Any = js.native
    
    /**
      * Determines whether `ref` may or may not export providers to NgModules which import it.
      *
      * NgModules export providers if any are declared, and standalone components export providers from
      * their `imports` array (if any).
      *
      * If `true`, then `ref` should be assumed to export providers. In practice, this could mean
      * either that `ref` is a local type that we _know_ exports providers, or it's imported from a
      * .d.ts library and is declared in a way where the compiler cannot prove that it doesn't.
      *
      * If `false`, then `ref` is guaranteed not to export providers.
      *
      * @param `ref` the class for which the provider status should be determined
      * @param `dependencyCallback` a callback that, if provided, will be called for every type
      *     which is used in the determination of provider status for `ref`
      * @returns `true` if `ref` should be assumed to export providers, or `false` if the compiler can
      *     prove that it does not
      */
    def mayExportProviders(ref: Reference[ClassDeclarationDeclarati]): Boolean = js.native
    def mayExportProviders(
      ref: Reference[ClassDeclarationDeclarati],
      dependencyCallback: js.Function1[/* importRef */ Reference[ClassDeclarationDeclarati], Unit]
    ): Boolean = js.native
    
    /* private */ var metaReader: Any = js.native
  }
}
