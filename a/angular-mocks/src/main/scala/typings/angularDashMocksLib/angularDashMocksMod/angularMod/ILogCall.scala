package typings
package angularDashMocksLib.angularDashMocksMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogCall extends js.Object {
  var logs: js.Array[java.lang.String]
}

object ILogCall {
  @scala.inline
  def apply(logs: js.Array[java.lang.String]): ILogCall = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logs")(logs)
    __obj.asInstanceOf[ILogCall]
  }
}

