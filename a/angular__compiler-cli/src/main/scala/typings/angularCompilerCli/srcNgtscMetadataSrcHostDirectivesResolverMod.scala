package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcHostDirectivesResolverMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/host_directives_resolver", "HostDirectivesResolver")
  @js.native
  open class HostDirectivesResolver protected () extends StObject {
    def this(metaReader: MetadataReader) = this()
    
    /* private */ var cache: Any = js.native
    
    /**
      * Filters the class property mappings so that only the allowed ones are present.
      * @param source Property mappings that should be filtered.
      * @param allowedProperties Property mappings that are allowed in the final results.
      * @param valueResolver Function used to resolve the value that is assigned to the final mapping.
      */
    /* private */ var filterMappings: Any = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /** Resolves all of the host directives that apply to a directive. */
    def resolve(metadata: DirectiveMeta): js.Array[DirectiveMeta] = js.native
    
    /**
      * Traverses all of the host directive chains and produces a flat array of
      * directive metadata representing the host directives that apply to the host.
      */
    /* private */ var walkHostDirectives: Any = js.native
  }
}
