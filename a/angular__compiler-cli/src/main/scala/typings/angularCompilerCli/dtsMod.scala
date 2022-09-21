package typings.angularCompilerCli

import typings.angularCompilerCli.metadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.metadataSrcApiMod.NgModuleMeta
import typings.angularCompilerCli.metadataSrcApiMod.PipeMeta
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/dts", "DtsMetadataReader")
  @js.native
  open class DtsMetadataReader protected ()
    extends StObject
       with MetadataReader {
    def this(checker: TypeChecker, reflector: ReflectionHost) = this()
    
    /* private */ var checker: Any = js.native
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclaration[DeclarationNode]]): PipeMeta | Null = js.native
    
    /* private */ var reflector: Any = js.native
  }
}
