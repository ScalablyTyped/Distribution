package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartInstanceRefreshAnswer extends js.Object {
  /**
    * A unique ID for tracking the progress of the request.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.native
}

object StartInstanceRefreshAnswer {
  @scala.inline
  def apply(InstanceRefreshId: XmlStringMaxLen255 = null): StartInstanceRefreshAnswer = {
    val __obj = js.Dynamic.literal()
    if (InstanceRefreshId != null) __obj.updateDynamic("InstanceRefreshId")(InstanceRefreshId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRefreshAnswer]
  }
}

