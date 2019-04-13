package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashIsoEncryptionSettings extends js.Object {
  /**
    * Settings for use with a SPEKE key provider
    */
  var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
}

object DashIsoEncryptionSettings {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider = null): DashIsoEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (SpekeKeyProvider != null) __obj.updateDynamic("SpekeKeyProvider")(SpekeKeyProvider)
    __obj.asInstanceOf[DashIsoEncryptionSettings]
  }
}

