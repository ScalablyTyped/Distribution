package typings
package angularDashMocksLib.angularDashMocksMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// AngularStatic
// We reopen it to add the MockStatic definition
///////////////////////////////////////////////////////////////////////////
trait IAngularStatic extends js.Object {
  var mock: IMockStatic
}

object IAngularStatic {
  @scala.inline
  def apply(mock: IMockStatic): IAngularStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mock")(mock)
    __obj.asInstanceOf[IAngularStatic]
  }
}

