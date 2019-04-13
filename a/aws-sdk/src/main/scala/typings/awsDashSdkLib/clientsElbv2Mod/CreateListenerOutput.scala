package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateListenerOutput extends js.Object {
  /**
    * Information about the listener.
    */
  var Listeners: js.UndefOr[Listeners] = js.undefined
}

object CreateListenerOutput {
  @scala.inline
  def apply(Listeners: Listeners = null): CreateListenerOutput = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners)
    __obj.asInstanceOf[CreateListenerOutput]
  }
}

