package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.srcJobsApiMod.JobName
import typings.angularDevkitCore.mod.BaseException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJobsExceptionMod {
  
  @JSImport("@angular-devkit/architect/src/jobs/exception", "JobDoesNotExistException")
  @js.native
  open class JobDoesNotExistException protected () extends BaseException {
    def this(name: JobName) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs/exception", "JobNameAlreadyRegisteredException")
  @js.native
  open class JobNameAlreadyRegisteredException protected () extends BaseException {
    def this(name: JobName) = this()
  }
}
