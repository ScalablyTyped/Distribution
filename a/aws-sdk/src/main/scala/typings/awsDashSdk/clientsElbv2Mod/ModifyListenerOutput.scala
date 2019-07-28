package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyListenerOutput extends js.Object {
  /**
    * Information about the modified listener.
    */
  var Listeners: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Listeners] = js.undefined
}

object ModifyListenerOutput {
  @scala.inline
  def apply(Listeners: Listeners = null): ModifyListenerOutput = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners)
    __obj.asInstanceOf[ModifyListenerOutput]
  }
}

