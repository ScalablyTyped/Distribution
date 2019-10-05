package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radios extends js.Object {
  /**
    * True if Bluetooth is enabled at the beginning of the test; otherwise, false.
    */
  var bluetooth: js.UndefOr[Boolean] = js.undefined
  /**
    * True if GPS is enabled at the beginning of the test; otherwise, false.
    */
  var gps: js.UndefOr[Boolean] = js.undefined
  /**
    * True if NFC is enabled at the beginning of the test; otherwise, false.
    */
  var nfc: js.UndefOr[Boolean] = js.undefined
  /**
    * True if Wi-Fi is enabled at the beginning of the test; otherwise, false.
    */
  var wifi: js.UndefOr[Boolean] = js.undefined
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
    if (!js.isUndefined(bluetooth)) __obj.updateDynamic("bluetooth")(bluetooth)
    if (!js.isUndefined(gps)) __obj.updateDynamic("gps")(gps)
    if (!js.isUndefined(nfc)) __obj.updateDynamic("nfc")(nfc)
    if (!js.isUndefined(wifi)) __obj.updateDynamic("wifi")(wifi)
    __obj.asInstanceOf[Radios]
  }
}

