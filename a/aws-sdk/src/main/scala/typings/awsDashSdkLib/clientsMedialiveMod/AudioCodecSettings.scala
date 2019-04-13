package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioCodecSettings extends js.Object {
  var AacSettings: js.UndefOr[AacSettings] = js.undefined
  var Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined
  var Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined
  var Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined
  var PassThroughSettings: js.UndefOr[PassThroughSettings] = js.undefined
}

object AudioCodecSettings {
  @scala.inline
  def apply(
    AacSettings: AacSettings = null,
    Ac3Settings: Ac3Settings = null,
    Eac3Settings: Eac3Settings = null,
    Mp2Settings: Mp2Settings = null,
    PassThroughSettings: PassThroughSettings = null
  ): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (AacSettings != null) __obj.updateDynamic("AacSettings")(AacSettings)
    if (Ac3Settings != null) __obj.updateDynamic("Ac3Settings")(Ac3Settings)
    if (Eac3Settings != null) __obj.updateDynamic("Eac3Settings")(Eac3Settings)
    if (Mp2Settings != null) __obj.updateDynamic("Mp2Settings")(Mp2Settings)
    if (PassThroughSettings != null) __obj.updateDynamic("PassThroughSettings")(PassThroughSettings)
    __obj.asInstanceOf[AudioCodecSettings]
  }
}

