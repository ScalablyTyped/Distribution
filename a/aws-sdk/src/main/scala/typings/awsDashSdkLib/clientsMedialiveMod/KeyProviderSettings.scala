package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyProviderSettings extends js.Object {
  var StaticKeySettings: js.UndefOr[StaticKeySettings] = js.undefined
}

object KeyProviderSettings {
  @scala.inline
  def apply(StaticKeySettings: StaticKeySettings = null): KeyProviderSettings = {
    val __obj = js.Dynamic.literal()
    if (StaticKeySettings != null) __obj.updateDynamic("StaticKeySettings")(StaticKeySettings)
    __obj.asInstanceOf[KeyProviderSettings]
  }
}

