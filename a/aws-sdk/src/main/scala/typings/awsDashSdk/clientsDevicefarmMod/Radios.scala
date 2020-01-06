package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radios extends js.Object {
  /**
    * True if Bluetooth is enabled at the beginning of the test. Otherwise, false.
    */
  var bluetooth: js.UndefOr[Boolean] = js.native
  /**
    * True if GPS is enabled at the beginning of the test. Otherwise, false.
    */
  var gps: js.UndefOr[Boolean] = js.native
  /**
    * True if NFC is enabled at the beginning of the test. Otherwise, false.
    */
  var nfc: js.UndefOr[Boolean] = js.native
  /**
    * True if Wi-Fi is enabled at the beginning of the test. Otherwise, false.
    */
  var wifi: js.UndefOr[Boolean] = js.native
}

object Radios {
  @scala.inline
  def apply(
    bluetooth: js.UndefOr[scala.Boolean] = js.undefined,
    gps: js.UndefOr[scala.Boolean] = js.undefined,
    nfc: js.UndefOr[scala.Boolean] = js.undefined,
    wifi: js.UndefOr[scala.Boolean] = js.undefined
  ): Radios = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bluetooth)) __obj.updateDynamic("bluetooth")(bluetooth.asInstanceOf[js.Any])
    if (!js.isUndefined(gps)) __obj.updateDynamic("gps")(gps.asInstanceOf[js.Any])
    if (!js.isUndefined(nfc)) __obj.updateDynamic("nfc")(nfc.asInstanceOf[js.Any])
    if (!js.isUndefined(wifi)) __obj.updateDynamic("wifi")(wifi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radios]
  }
}

