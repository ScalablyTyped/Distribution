package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupTimeline extends js.Object {
  /**
    * The creation date and time of the instance group.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The date and time when the instance group terminated.
    */
  var EndDateTime: js.UndefOr[_Date] = js.native
  /**
    * The date and time when the instance group became ready to perform tasks.
    */
  var ReadyDateTime: js.UndefOr[_Date] = js.native
}

object InstanceGroupTimeline {
  @scala.inline
  def apply(CreationDateTime: _Date = null, EndDateTime: _Date = null, ReadyDateTime: _Date = null): InstanceGroupTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupTimeline]
  }
}

