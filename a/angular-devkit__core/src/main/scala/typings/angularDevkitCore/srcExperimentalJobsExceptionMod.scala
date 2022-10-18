package typings.angularDevkitCore

import typings.angularDevkitCore.srcExceptionMod.BaseException
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExperimentalJobsExceptionMod {
  
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
