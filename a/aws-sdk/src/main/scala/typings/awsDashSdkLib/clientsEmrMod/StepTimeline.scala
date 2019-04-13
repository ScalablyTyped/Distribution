package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepTimeline extends js.Object {
  /**
    * The date and time when the cluster step was created.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time when the cluster step execution completed or failed.
    */
  var EndDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time when the cluster step execution started.
    */
  var StartDateTime: js.UndefOr[_Date] = js.undefined
}

object StepTimeline {
  @scala.inline
  def apply(CreationDateTime: _Date = null, EndDateTime: _Date = null, StartDateTime: _Date = null): StepTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime)
    __obj.asInstanceOf[StepTimeline]
  }
}

