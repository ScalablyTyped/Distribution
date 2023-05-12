package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.PipeMeta
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcDtsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/dts", "DtsMetadataReader")
  @js.native
  open class DtsMetadataReader protected ()
    extends StObject
       with MetadataReader {
    def this(checker: TypeChecker, reflector: ReflectionHost) = this()
    
    /* private */ var checker: Any = js.native
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclarationDeclarati]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclarationDeclarati]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclarationDeclarati]): PipeMeta | Null = js.native
    
    /* private */ var reflector: Any = js.native
  }
}
