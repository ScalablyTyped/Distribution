package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSummary extends js.Object {
  /**
    * The ARN of the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.undefined
  /**
    * The date when the project was originally created, in UNIX epoch time format.
    */
  var createdDate: Time
  /**
    * The name of the project being summarized.
    */
  var projectName: ProjectName
  /**
    * The tags (metadata key/value pairs) associated with the project.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: Time
}

object ProjectSummary {
  @scala.inline
  def apply(
    createdDate: Time,
    projectName: ProjectName,
    updatedDate: Time,
    arn: ProjectArn = null,
    tags: TagMap = null
  ): ProjectSummary = {
    val __obj = js.Dynamic.literal(createdDate = createdDate, projectName = projectName, updatedDate = updatedDate)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ProjectSummary]
  }
}

