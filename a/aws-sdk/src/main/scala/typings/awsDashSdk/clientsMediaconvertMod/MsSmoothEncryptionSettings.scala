package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsSmoothEncryptionSettings extends js.Object {
  /**
    * Use these settings when doing DRM encryption with a SPEKE-compliant key provider, if your output group type is HLS, MS Smooth, or DASH. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.SpekeKeyProvider] = js.undefined
}

object MsSmoothEncryptionSettings {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider = null): MsSmoothEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (SpekeKeyProvider != null) __obj.updateDynamic("SpekeKeyProvider")(SpekeKeyProvider)
    __obj.asInstanceOf[MsSmoothEncryptionSettings]
  }
}

