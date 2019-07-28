package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityStartedEventDetails extends js.Object {
  /**
    * The name of the worker that the task is assigned to. These names are provided by the workers when calling GetActivityTask.
    */
  var workerName: js.UndefOr[Identity] = js.undefined
}

object ActivityStartedEventDetails {
  @scala.inline
  def apply(workerName: Identity = null): ActivityStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    if (workerName != null) __obj.updateDynamic("workerName")(workerName)
    __obj.asInstanceOf[ActivityStartedEventDetails]
  }
}

