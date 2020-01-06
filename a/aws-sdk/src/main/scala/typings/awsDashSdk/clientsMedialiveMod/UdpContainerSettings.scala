package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UdpContainerSettings extends js.Object {
  var M2tsSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.M2tsSettings] = js.native
}

object UdpContainerSettings {
  @scala.inline
  def apply(M2tsSettings: M2tsSettings = null): UdpContainerSettings = {
    val __obj = js.Dynamic.literal()
    if (M2tsSettings != null) __obj.updateDynamic("M2tsSettings")(M2tsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UdpContainerSettings]
  }
}

