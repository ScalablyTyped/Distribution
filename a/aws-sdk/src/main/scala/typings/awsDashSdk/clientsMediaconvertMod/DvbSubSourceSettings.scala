package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbSubSourceSettings extends js.Object {
  /**
    * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
    */
  var Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined
}

object DvbSubSourceSettings {
  @scala.inline
  def apply(Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined): DvbSubSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pid)) __obj.updateDynamic("Pid")(Pid)
    __obj.asInstanceOf[DvbSubSourceSettings]
  }
}

