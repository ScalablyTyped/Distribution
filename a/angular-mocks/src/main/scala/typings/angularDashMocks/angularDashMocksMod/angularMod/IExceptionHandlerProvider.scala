package typings.angularDashMocks.angularDashMocksMod.angularMod

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ExceptionHandlerService
// see https://docs.angularjs.org/api/ngMock/service/$exceptionHandler
// see https://docs.angularjs.org/api/ngMock/provider/$exceptionHandlerProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait IExceptionHandlerProvider extends IServiceProvider {
  def mode(mode: String): Unit = js.native
}

