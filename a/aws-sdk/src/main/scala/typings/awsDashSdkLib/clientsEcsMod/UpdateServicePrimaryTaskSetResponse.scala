package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServicePrimaryTaskSetResponse extends js.Object {
  var taskSet: js.UndefOr[TaskSet] = js.undefined
}

object UpdateServicePrimaryTaskSetResponse {
  @scala.inline
  def apply(taskSet: TaskSet = null): UpdateServicePrimaryTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    if (taskSet != null) __obj.updateDynamic("taskSet")(taskSet)
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetResponse]
  }
}

