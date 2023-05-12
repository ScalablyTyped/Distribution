package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReaderWithIndex
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.PipeMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcRegistryMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/registry", "CompoundMetadataRegistry")
  @js.native
  open class CompoundMetadataRegistry protected ()
    extends StObject
       with MetadataRegistry {
    def this(registries: js.Array[MetadataRegistry]) = this()
    
    /* CompleteClass */
    override def registerDirectiveMetadata(meta: DirectiveMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerNgModuleMetadata(meta: NgModuleMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerPipeMetadata(meta: PipeMeta): Unit = js.native
    
    /* private */ var registries: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/registry", "LocalMetadataRegistry")
  @js.native
  open class LocalMetadataRegistry ()
    extends StObject
       with MetadataRegistry
       with MetadataReaderWithIndex {
    
    /* private */ var directives: Any = js.native
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclarationDeclarati]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getKnown(kind: MetaKind): js.Array[ClassDeclarationDeclarati] = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclarationDeclarati]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclarationDeclarati]): PipeMeta | Null = js.native
    
    /* private */ var ngModules: Any = js.native
    
    /* private */ var pipes: Any = js.native
    
    /* CompleteClass */
    override def registerDirectiveMetadata(meta: DirectiveMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerNgModuleMetadata(meta: NgModuleMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerPipeMetadata(meta: PipeMeta): Unit = js.native
  }
}
