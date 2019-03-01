package typings
package actioncableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInterface extends js.Object {
  var cable: js.UndefOr[actioncableLib.ActionCableNs.Cable] = js.undefined
  var network: js.UndefOr[actioncableLib.ActionCableNs.Channel] = js.undefined
}

object AppInterface {
  @scala.inline
  def apply(
    cable: actioncableLib.ActionCableNs.Cable = null,
    network: actioncableLib.ActionCableNs.Channel = null
  ): AppInterface = {
    val __obj = js.Dynamic.literal()
    if (cable != null) __obj.updateDynamic("cable")(cable)
    if (network != null) __obj.updateDynamic("network")(network)
    __obj.asInstanceOf[AppInterface]
  }
}

