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
  def apply(): SuspendedProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendedProcess]
  }
  @scala.inline
  implicit class SuspendedProcessOps[Self <: SuspendedProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProcessName(value: XmlStringMaxLen255): Self = this.set("ProcessName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessName: Self = this.set("ProcessName", js.undefined)
    @scala.inline
    def setSuspensionReason(value: XmlStringMaxLen255): Self = this.set("SuspensionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspensionReason: Self = this.set("SuspensionReason", js.undefined)
  }
  
}

