package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UdpContainerSettings extends js.Object {
  var M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
}

object UdpContainerSettings {
  @scala.inline
  def apply(M2tsSettings: M2tsSettings = null): UdpContainerSettings = {
    val __obj = js.Dynamic.literal()
    if (M2tsSettings != null) __obj.updateDynamic("M2tsSettings")(M2tsSettings)
    __obj.asInstanceOf[UdpContainerSettings]
  }
}

