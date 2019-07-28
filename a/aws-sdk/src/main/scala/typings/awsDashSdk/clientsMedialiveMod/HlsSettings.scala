package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsSettings extends js.Object {
  var AudioOnlyHlsSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AudioOnlyHlsSettings] = js.undefined
  var StandardHlsSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.StandardHlsSettings] = js.undefined
}

object HlsSettings {
  @scala.inline
  def apply(AudioOnlyHlsSettings: AudioOnlyHlsSettings = null, StandardHlsSettings: StandardHlsSettings = null): HlsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioOnlyHlsSettings != null) __obj.updateDynamic("AudioOnlyHlsSettings")(AudioOnlyHlsSettings)
    if (StandardHlsSettings != null) __obj.updateDynamic("StandardHlsSettings")(StandardHlsSettings)
    __obj.asInstanceOf[HlsSettings]
  }
}

