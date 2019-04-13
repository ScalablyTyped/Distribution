package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateListenerResponse extends js.Object {
  /**
    * Information for the updated listener.
    */
  var Listener: js.UndefOr[Listener] = js.undefined
}

object UpdateListenerResponse {
  @scala.inline
  def apply(Listener: Listener = null): UpdateListenerResponse = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener)
    __obj.asInstanceOf[UpdateListenerResponse]
  }
}

