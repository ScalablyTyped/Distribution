package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspendedProcess extends js.Object {
  /**
    * The name of the suspended process.
    */
  var ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The reason that the process was suspended.
    */
  var SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.undefined
}

object SuspendedProcess {
  @scala.inline
  def apply(ProcessName: XmlStringMaxLen255 = null, SuspensionReason: XmlStringMaxLen255 = null): SuspendedProcess = {
    val __obj = js.Dynamic.literal()
    if (ProcessName != null) __obj.updateDynamic("ProcessName")(ProcessName)
    if (SuspensionReason != null) __obj.updateDynamic("SuspensionReason")(SuspensionReason)
    __obj.asInstanceOf[SuspendedProcess]
  }
}

