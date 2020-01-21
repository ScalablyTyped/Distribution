package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendedProcess extends js.Object {
  /**
    * The name of the suspended process.
    */
  var ProcessName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The reason that the process was suspended.
    */
  var SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.native
}

object SuspendedProcess {
  @scala.inline
  def apply(ProcessName: XmlStringMaxLen255 = null, SuspensionReason: XmlStringMaxLen255 = null): SuspendedProcess = {
    val __obj = js.Dynamic.literal()
    if (ProcessName != null) __obj.updateDynamic("ProcessName")(ProcessName.asInstanceOf[js.Any])
    if (SuspensionReason != null) __obj.updateDynamic("SuspensionReason")(SuspensionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendedProcess]
  }
}

