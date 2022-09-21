package typings.angularDevkitCore

import typings.angularDevkitCore.exceptionMod.BaseException
import typings.angularDevkitCore.jobsApiMod.JobName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsExceptionMod {
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/exception", "JobDoesNotExistException")
  @js.native
  open class JobDoesNotExistException protected () extends BaseException {
    def this(name: JobName) = this()
  }
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/exception", "JobNameAlreadyRegisteredException")
  @js.native
  open class JobNameAlreadyRegisteredException protected () extends BaseException {
    def this(name: JobName) = this()
  }
}
