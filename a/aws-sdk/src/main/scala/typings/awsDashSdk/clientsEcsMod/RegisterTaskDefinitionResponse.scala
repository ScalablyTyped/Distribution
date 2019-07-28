package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterTaskDefinitionResponse extends js.Object {
  /**
    * The list of tags associated with the task definition.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The full description of the registered task definition.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
}

object RegisterTaskDefinitionResponse {
  @scala.inline
  def apply(tags: Tags = null, taskDefinition: TaskDefinition = null): RegisterTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition)
    __obj.asInstanceOf[RegisterTaskDefinitionResponse]
  }
}

