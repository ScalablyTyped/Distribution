package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateListenerResponse extends js.Object {
  /**
    * The listener that you've created.
    */
  var Listener: js.UndefOr[Listener] = js.undefined
}

object CreateListenerResponse {
  @scala.inline
  def apply(Listener: Listener = null): CreateListenerResponse = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener)
    __obj.asInstanceOf[CreateListenerResponse]
  }
}

