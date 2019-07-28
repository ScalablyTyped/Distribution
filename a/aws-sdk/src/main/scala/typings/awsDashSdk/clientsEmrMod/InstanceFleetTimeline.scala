package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceFleetTimeline extends js.Object {
  /**
    * The time and date the instance fleet was created.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time and date the instance fleet terminated.
    */
  var EndDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time and date the instance fleet was ready to run jobs.
    */
  var ReadyDateTime: js.UndefOr[_Date] = js.undefined
}

object InstanceFleetTimeline {
  @scala.inline
  def apply(CreationDateTime: _Date = null, EndDateTime: _Date = null, ReadyDateTime: _Date = null): InstanceFleetTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime)
    __obj.asInstanceOf[InstanceFleetTimeline]
  }
}

