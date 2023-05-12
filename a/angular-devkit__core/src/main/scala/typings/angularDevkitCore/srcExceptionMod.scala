package typings.angularDevkitCore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExceptionMod {
  
  @JSImport("@angular-devkit/core/src/exception", "BaseException")
  @js.native
  open class BaseException ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@angular-devkit/core/src/exception", "FileAlreadyExistException")
  @js.native
  open class FileAlreadyExistException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/exception", "FileDoesNotExistException")
  @js.native
  open class FileDoesNotExistException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/exception", "PathIsDirectoryException")
  @js.native
  open class PathIsDirectoryException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/exception", "PathIsFileException")
  @js.native
  open class PathIsFileException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/exception", "UnknownException")
  @js.native
  open class UnknownException protected () extends BaseException {
    def this(message: String) = this()
  }
}
