package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReaderWithIndex
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcNgModuleIndexMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/ng_module_index", "NgModuleIndexImpl")
  @js.native
  open class NgModuleIndexImpl protected ()
    extends StObject
       with NgModuleIndex {
    def this(metaReader: MetadataReader, localReader: MetadataReaderWithIndex) = this()
    
    /* CompleteClass */
    override def getNgModulesExporting(directiveOrPipe: ClassDeclarationDeclarati): js.Array[Reference[ClassDeclarationDeclarati]] = js.native
    
    /* private */ var index: Any = js.native
    
    /* private */ var indexTrait: Any = js.native
    
    /* private */ var indexed: Any = js.native
    
    /* private */ var localReader: Any = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /* private */ var ngModuleAuthoritativeReference: Any = js.native
    
    /* private */ var typeToExportingModules: Any = js.native
    
    /* private */ var updateWith: Any = js.native
  }
}
