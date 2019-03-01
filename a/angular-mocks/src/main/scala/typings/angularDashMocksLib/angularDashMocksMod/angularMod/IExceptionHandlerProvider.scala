package typings
package angularDashMocksLib.angularDashMocksMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ExceptionHandlerService
// see https://docs.angularjs.org/api/ngMock/service/$exceptionHandler
// see https://docs.angularjs.org/api/ngMock/provider/$exceptionHandlerProvider
///////////////////////////////////////////////////////////////////////////
trait IExceptionHandlerProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  def mode(mode: java.lang.String): scala.Unit
}

object IExceptionHandlerProvider {
  @scala.inline
  def apply($get: js.Any, mode: js.Function1[java.lang.String, scala.Unit]): IExceptionHandlerProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[IExceptionHandlerProvider]
  }
}

