package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterTimeline extends js.Object {
  /**
    * The creation date and time of the cluster.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time when the cluster was terminated.
    */
  var EndDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time when the cluster was ready to execute steps.
    */
  var ReadyDateTime: js.UndefOr[_Date] = js.undefined
}

object ClusterTimeline {
  @scala.inline
  def apply(CreationDateTime: _Date = null, EndDateTime: _Date = null, ReadyDateTime: _Date = null): ClusterTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime)
    __obj.asInstanceOf[ClusterTimeline]
  }
}

