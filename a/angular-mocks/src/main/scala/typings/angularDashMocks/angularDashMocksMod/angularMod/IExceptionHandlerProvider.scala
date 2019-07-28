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
trait IExceptionHandlerProvider extends IServiceProvider {
  def mode(mode: String): Unit
}

object IExceptionHandlerProvider {
  @scala.inline
  def apply($get: js.Any, mode: String => Unit): IExceptionHandlerProvider = {
    val __obj = js.Dynamic.literal($get = $get, mode = js.Any.fromFunction1(mode))
  
    __obj.asInstanceOf[IExceptionHandlerProvider]
  }
}

