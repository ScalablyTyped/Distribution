package typings.angularDevkitCore

import typings.angularDevkitCore.hostInterfaceMod.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceHostMod {
  
  @JSImport("@angular-devkit/core/src/workspace/host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWorkspaceHost(host: Host[js.Object]): WorkspaceHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkspaceHost")(host.asInstanceOf[js.Any]).asInstanceOf[WorkspaceHost]
  
  trait WorkspaceHost extends StObject {
    
    def isDirectory(path: String): js.Promise[Boolean]
    
    def isFile(path: String): js.Promise[Boolean]
    
    def readFile(path: String): js.Promise[String]
    
    def writeFile(path: String, data: String): js.Promise[Unit]
  }
  object WorkspaceHost {
    
    inline def apply(
      isDirectory: String => js.Promise[Boolean],
      isFile: String => js.Promise[Boolean],
      readFile: String => js.Promise[String],
      writeFile: (String, String) => js.Promise[Unit]
    ): WorkspaceHost = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction1(isDirectory), isFile = js.Any.fromFunction1(isFile), readFile = js.Any.fromFunction1(readFile), writeFile = js.Any.fromFunction2(writeFile))
      __obj.asInstanceOf[WorkspaceHost]
    }
    
    extension [Self <: WorkspaceHost](x: Self) {
      
      inline def setIsDirectory(value: String => js.Promise[Boolean]): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsFile(value: String => js.Promise[Boolean]): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setReadFile(value: String => js.Promise[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setWriteFile(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "writeFile", js.Any.fromFunction2(value))
    }
  }
}
