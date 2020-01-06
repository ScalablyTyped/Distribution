package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskDefinitionRequest extends js.Object {
  /**
    * Specifies whether to see the resource tags for the task definition. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[TaskDefinitionFieldList] = js.native
  /**
    * The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, or full Amazon Resource Name (ARN) of the task definition to describe.
    */
  var taskDefinition: String = js.native
}

object DescribeTaskDefinitionRequest {
  @scala.inline
  def apply(taskDefinition: String, include: TaskDefinitionFieldList = null): DescribeTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskDefinitionRequest]
  }
}

