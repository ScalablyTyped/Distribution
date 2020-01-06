package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSettings extends js.Object {
  /**
    * Settings for HLS output groups
    */
  var HlsSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.HlsSettings] = js.native
}

object OutputSettings {
  @scala.inline
  def apply(HlsSettings: HlsSettings = null): OutputSettings = {
    val __obj = js.Dynamic.literal()
    if (HlsSettings != null) __obj.updateDynamic("HlsSettings")(HlsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSettings]
  }
}

