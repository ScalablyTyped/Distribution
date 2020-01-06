package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterTimeline extends js.Object {
  /**
    * The creation date and time of the cluster.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The date and time when the cluster was terminated.
    */
  var EndDateTime: js.UndefOr[_Date] = js.native
  /**
    * The date and time when the cluster was ready to execute steps.
    */
  var ReadyDateTime: js.UndefOr[_Date] = js.native
}

object ClusterTimeline {
  @scala.inline
  def apply(CreationDateTime: _Date = null, EndDateTime: _Date = null, ReadyDateTime: _Date = null): ClusterTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterTimeline]
  }
}

