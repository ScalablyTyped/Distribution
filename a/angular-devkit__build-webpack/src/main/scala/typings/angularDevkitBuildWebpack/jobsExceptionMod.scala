package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.exceptionMod.BaseException
import typings.angularDevkitBuildWebpack.jobsApiMod.JobName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsExceptionMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs/exception", "JobDoesNotExistException")
  @js.native
  open class JobDoesNotExistException protected () extends BaseException {
    def this(name: JobName) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs/exception", "JobNameAlreadyRegisteredException")
  @js.native
  open class JobNameAlreadyRegisteredException protected () extends BaseException {
    def this(name: JobName) = this()
  }
}
