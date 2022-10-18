package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscFileSystemSrcNodeJsFileSystemMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/node_js_file_system", "NodeJSFileSystem")
  @js.native
  open class NodeJSFileSystem ()
    extends NodeJSReadonlyFileSystem
       with FileSystem {
    
    /* private */ var safeMkdir: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/node_js_file_system", "NodeJSPathManipulation")
  @js.native
  open class NodeJSPathManipulation ()
    extends StObject
       with PathManipulation {
    
    def dirname[T /* <: String */](file: T): T = js.native
    
    def join[T /* <: String */](basePath: T, paths: String*): T = js.native
    
    def normalize[T /* <: String */](path: T): T = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/node_js_file_system", "NodeJSReadonlyFileSystem")
  @js.native
  open class NodeJSReadonlyFileSystem ()
    extends NodeJSPathManipulation
       with ReadonlyFileSystem {
    
    /* private */ var _caseSensitive: Any = js.native
  }
}
