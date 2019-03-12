package typings
package angularDashMocksLib.angularDashMocksMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// LogService
// see https://docs.angularjs.org/api/ngMock/service/$log
// Augments the original service
///////////////////////////////////////////////////////////////////////////
trait ILogService extends js.Object {
  def assertEmpty(): scala.Unit
  def reset(): scala.Unit
}

object ILogService {
  @scala.inline
  def apply(assertEmpty: () => scala.Unit, reset: () => scala.Unit): ILogService = {
    val __obj = js.Dynamic.literal(assertEmpty = js.Any.fromFunction0(assertEmpty), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[ILogService]
  }
}

