package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "ContentHasMutatedException")
  @js.native
  open class ContentHasMutatedException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "FileAlreadyExistException")
  @js.native
  open class FileAlreadyExistException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "FileDoesNotExistException")
  @js.native
  open class FileDoesNotExistException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "InvalidUpdateRecordException")
  @js.native
  open class InvalidUpdateRecordException () extends BaseException
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "MergeConflictException")
  @js.native
  open class MergeConflictException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "SchematicsException")
  @js.native
  open class SchematicsException () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "UnimplementedException")
  @js.native
  open class UnimplementedException () extends BaseException
  
  @JSImport("@angular-devkit/schematics/src/exception/exception", "UnsuccessfulWorkflowExecution")
  @js.native
  open class UnsuccessfulWorkflowExecution () extends BaseException
}
