package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.undefined
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The date and time the project was created, in timestamp format.
    */
  var createdTimeStamp: js.UndefOr[CreatedTimestamp] = js.undefined
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  /**
    * The ID of the project.
    */
  var id: js.UndefOr[ProjectId] = js.undefined
  /**
    * The display name for the project.
    */
  var name: js.UndefOr[ProjectName] = js.undefined
  /**
    * The ID for the AWS CodeStar project template used to create the project.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined
  /**
    * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
    */
  var stackId: js.UndefOr[StackId] = js.undefined
  /**
    * The project creation or deletion status.
    */
  var status: js.UndefOr[ProjectStatus] = js.undefined
}

object DescribeProjectResult {
  @scala.inline
  def apply(
    arn: ProjectArn = null,
    clientRequestToken: ClientRequestToken = null,
    createdTimeStamp: CreatedTimestamp = null,
    description: ProjectDescription = null,
    id: ProjectId = null,
    name: ProjectName = null,
    projectTemplateId: ProjectTemplateId = null,
    stackId: StackId = null,
    status: ProjectStatus = null
  ): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (createdTimeStamp != null) __obj.updateDynamic("createdTimeStamp")(createdTimeStamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (projectTemplateId != null) __obj.updateDynamic("projectTemplateId")(projectTemplateId)
    if (stackId != null) __obj.updateDynamic("stackId")(stackId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DescribeProjectResult]
  }
}

