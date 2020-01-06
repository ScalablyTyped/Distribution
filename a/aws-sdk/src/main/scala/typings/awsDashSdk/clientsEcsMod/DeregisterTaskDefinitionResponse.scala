package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTaskDefinitionResponse extends js.Object {
  /**
    * The full description of the deregistered task.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.native
}

object DeregisterTaskDefinitionResponse {
  @scala.inline
  def apply(taskDefinition: TaskDefinition = null): DeregisterTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTaskDefinitionResponse]
  }
}

