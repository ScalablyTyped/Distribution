package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProjectRequest extends js.Object {
  /**
    * An optional user-defined description for the project.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * An object defining the project update. Once a project has been created, you cannot add device template names to the project. However, for a given placementTemplate, you can update the associated callbackOverrides for the device definition using this API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
  /**
    * The name of the project to be updated.
    */
  var projectName: ProjectName
}

object UpdateProjectRequest {
  @scala.inline
  def apply(
    projectName: ProjectName,
    description: Description = null,
    placementTemplate: PlacementTemplate = null
  ): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName)
    if (description != null) __obj.updateDynamic("description")(description)
    if (placementTemplate != null) __obj.updateDynamic("placementTemplate")(placementTemplate)
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

