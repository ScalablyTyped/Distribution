package typings.angularCompilerCli

import typings.angularCompilerCli.srcTypesMod.FileSystem
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerHostMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/compiler_host", "NgtscCompilerHost")
  @js.native
  open class NgtscCompilerHost protected ()
    extends StObject
       with CompilerHost {
    def this(fs: FileSystem) = this()
    def this(fs: FileSystem, options: CompilerOptions) = this()
    
    /* CompleteClass */
    override def fileExists(fileName: String): Boolean = js.native
    
    /* protected */ var fs: FileSystem = js.native
    
    @JSName("getCurrentDirectory")
    def getCurrentDirectory_MNgtscCompilerHost(): String = js.native
    
    @JSName("getDefaultLibLocation")
    def getDefaultLibLocation_MNgtscCompilerHost(): String = js.native
    
    /* protected */ var options: CompilerOptions = js.native
    
    /* CompleteClass */
    override def readFile(fileName: String): js.UndefOr[String] = js.native
    
    @JSName("realpath")
    def realpath_MNgtscCompilerHost(path: String): String = js.native
    
    @JSName("useCaseSensitiveFileNames")
    def useCaseSensitiveFileNames_MNgtscCompilerHost(): Boolean = js.native
  }
}
