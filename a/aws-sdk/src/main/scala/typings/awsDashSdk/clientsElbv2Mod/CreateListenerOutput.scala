package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateListenerOutput extends js.Object {
  /**
    * Information about the listener.
    */
  var Listeners: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Listeners] = js.native
}

object CreateListenerOutput {
  @scala.inline
  def apply(Listeners: Listeners = null): CreateListenerOutput = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListenerOutput]
  }
}

