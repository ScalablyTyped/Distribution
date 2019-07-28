package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDescription extends js.Object {
  /**
    * The ARN of the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.undefined
  /**
    * The date when the project was originally created, in UNIX epoch time format.
    */
  var createdDate: Time
  /**
    * The description of the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * An object describing the project's placement specifications.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
  /**
    * The name of the project for which to obtain information from.
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

object ProjectDescription {
  @scala.inline
  def apply(
    createdDate: Time,
    projectName: ProjectName,
    updatedDate: Time,
    arn: ProjectArn = null,
    description: Description = null,
    placementTemplate: PlacementTemplate = null,
    tags: TagMap = null
  ): ProjectDescription = {
    val __obj = js.Dynamic.literal(createdDate = createdDate, projectName = projectName, updatedDate = updatedDate)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (placementTemplate != null) __obj.updateDynamic("placementTemplate")(placementTemplate)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ProjectDescription]
  }
}

