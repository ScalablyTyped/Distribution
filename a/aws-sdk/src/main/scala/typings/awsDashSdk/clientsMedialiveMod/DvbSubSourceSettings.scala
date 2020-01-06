package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSubSourceSettings extends js.Object {
  /**
    * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
    */
  var Pid: js.UndefOr[__integerMin1] = js.native
}

object DvbSubSourceSettings {
  @scala.inline
  def apply(Pid: Int | Double = null): DvbSubSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Pid != null) __obj.updateDynamic("Pid")(Pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbSubSourceSettings]
  }
}

