package typings.angularCompilerCli

import typings.angularCompilerCli.metadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.metadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.metadataSrcApiMod.NgModuleMeta
import typings.angularCompilerCli.metadataSrcApiMod.PipeMeta
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
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
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/registry", "InjectableClassRegistry")
  @js.native
  open class InjectableClassRegistry protected () extends StObject {
    def this(host: ReflectionHost) = this()
    
    /* private */ var classes: Any = js.native
    
    /* private */ var host: Any = js.native
    
    def isInjectable(declaration: ClassDeclaration[DeclarationNode]): Boolean = js.native
    
    def registerInjectable(declaration: ClassDeclaration[DeclarationNode]): Unit = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/registry", "LocalMetadataRegistry")
  @js.native
  open class LocalMetadataRegistry ()
    extends StObject
       with MetadataRegistry
       with MetadataReader {
    
    /* private */ var directives: Any = js.native
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): PipeMeta | Null = js.native
    
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
