package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * An optional user-defined description for the project.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * An object defining the project update. Once a project has been created, you cannot add device template names to the project. However, for a given placementTemplate, you can update the associated callbackOverrides for the device definition using this API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.native
  /**
    * The name of the project to be updated.
    */
  var projectName: ProjectName = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(
    projectName: ProjectName,
    description: Description = null,
    placementTemplate: PlacementTemplate = null
  ): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (placementTemplate != null) __obj.updateDynamic("placementTemplate")(placementTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

