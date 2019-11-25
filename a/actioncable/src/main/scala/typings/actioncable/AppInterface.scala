package typings.actioncable

import typings.actioncable.ActionCable.Cable
import typings.actioncable.ActionCable.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInterface extends js.Object {
  var cable: js.UndefOr[Cable] = js.undefined
  var network: js.UndefOr[Channel] = js.undefined
}

object AppInterface {
  @scala.inline
  def apply(cable: Cable = null, network: Channel = null): AppInterface = {
    val __obj = js.Dynamic.literal()
    if (cable != null) __obj.updateDynamic("cable")(cable.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInterface]
  }
}

