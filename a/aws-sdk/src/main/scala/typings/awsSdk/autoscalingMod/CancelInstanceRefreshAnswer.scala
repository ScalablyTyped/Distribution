package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelInstanceRefreshAnswer extends js.Object {
  /**
    * The instance refresh ID.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.native
}

object CancelInstanceRefreshAnswer {
  @scala.inline
  def apply(InstanceRefreshId: XmlStringMaxLen255 = null): CancelInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    if (InstanceRefreshId != null) __obj.updateDynamic("InstanceRefreshId")(InstanceRefreshId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelInstanceRefreshAnswer]
  }
}

