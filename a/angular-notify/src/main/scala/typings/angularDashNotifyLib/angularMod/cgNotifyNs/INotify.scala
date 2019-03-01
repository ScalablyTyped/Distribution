package typings
package angularDashNotifyLib.angularMod.cgNotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotify extends js.Object {
  /**
    * The message to show.
    */
  var message: java.lang.String
  /**
    * Close this open notifications.
    */
  def close(): scala.Unit
}

object INotify {
  @scala.inline
  def apply(close: js.Function0[scala.Unit], message: java.lang.String): INotify = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[INotify]
  }
}

