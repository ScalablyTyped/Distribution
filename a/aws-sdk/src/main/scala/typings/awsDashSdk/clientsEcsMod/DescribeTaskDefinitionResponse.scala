package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTaskDefinitionResponse extends js.Object {
  /**
    * The metadata that is applied to the task definition to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The full task definition description.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
}

object DescribeTaskDefinitionResponse {
  @scala.inline
  def apply(tags: Tags = null, taskDefinition: TaskDefinition = null): DescribeTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition)
    __obj.asInstanceOf[DescribeTaskDefinitionResponse]
  }
}

