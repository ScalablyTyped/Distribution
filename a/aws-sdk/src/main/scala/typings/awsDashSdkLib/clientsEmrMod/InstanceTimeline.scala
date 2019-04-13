package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTimeline extends js.Object {
  /**
    * The creation date and time of the instance.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time when the instance was terminated.
    */
  var EndDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time when the instance was ready to perform tasks.
    */
  var ReadyDateTime: js.UndefOr[_Date] = js.undefined
}

object InstanceTimeline {
  @scala.inline
  def apply(CreationDateTime: _Date = null, EndDateTime: _Date = null, ReadyDateTime: _Date = null): InstanceTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime)
    __obj.asInstanceOf[InstanceTimeline]
  }
}

