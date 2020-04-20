package typings.angularMocks.mod.angularAugmentingMod

import typings.angular.mod.IServiceProvider
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
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], mode = js.Any.fromFunction1(mode))
    __obj.asInstanceOf[IExceptionHandlerProvider]
  }
}

