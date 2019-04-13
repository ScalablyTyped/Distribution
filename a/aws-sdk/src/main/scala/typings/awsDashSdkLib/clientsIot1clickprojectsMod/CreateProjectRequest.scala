package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectRequest extends js.Object {
  /**
    * An optional description for the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The schema defining the placement to be created. A placement template defines placement default attributes and device templates. You cannot add or remove device templates after the project has been created. However, you can update callbackOverrides for the device templates using the UpdateProject API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
  /**
    * The name of the project to create.
    */
  var projectName: ProjectName
  /**
    * Optional tags (metadata key/value pairs) to be associated with the project. For example, { {"key1": "value1", "key2": "value2"} }. For more information, see AWS Tagging Strategies.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateProjectRequest {
  @scala.inline
  def apply(
    projectName: ProjectName,
    description: Description = null,
    placementTemplate: PlacementTemplate = null,
    tags: TagMap = null
  ): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName)
    if (description != null) __obj.updateDynamic("description")(description)
    if (placementTemplate != null) __obj.updateDynamic("placementTemplate")(placementTemplate)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

