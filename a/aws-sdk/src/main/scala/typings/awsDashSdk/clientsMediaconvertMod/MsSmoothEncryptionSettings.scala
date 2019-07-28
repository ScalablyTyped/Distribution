package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsSmoothEncryptionSettings extends js.Object {
  /**
    * Settings for use with a SPEKE key provider
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

