package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticKeySettings extends js.Object {
  /**
    * The URL of the license server used for protecting content.
    */
  var KeyProviderServer: js.UndefOr[InputLocation] = js.undefined
  /**
    * Static key value as a 32 character hexadecimal string.
    */
  var StaticKeyValue: __stringMin32Max32
}

object StaticKeySettings {
  @scala.inline
  def apply(StaticKeyValue: __stringMin32Max32, KeyProviderServer: InputLocation = null): StaticKeySettings = {
    val __obj = js.Dynamic.literal(StaticKeyValue = StaticKeyValue)
    if (KeyProviderServer != null) __obj.updateDynamic("KeyProviderServer")(KeyProviderServer)
    __obj.asInstanceOf[StaticKeySettings]
  }
}

