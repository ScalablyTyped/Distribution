package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTaskDefinitionResponse extends js.Object {
  /**
    * The list of tags associated with the task definition.
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The full description of the registered task definition.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.native
}

object RegisterTaskDefinitionResponse {
  @scala.inline
  def apply(tags: Tags = null, taskDefinition: TaskDefinition = null): RegisterTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTaskDefinitionResponse]
  }
}

