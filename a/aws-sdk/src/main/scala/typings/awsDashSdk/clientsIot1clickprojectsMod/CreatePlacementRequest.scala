package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlacementRequest extends js.Object {
  /**
    * Optional user-defined key/value pairs providing contextual data (such as location or function) for the placement.
    */
  var attributes: js.UndefOr[PlacementAttributeMap] = js.undefined
  /**
    * The name of the placement to be created.
    */
  var placementName: PlacementName
  /**
    * The name of the project in which to create the placement.
    */
  var projectName: ProjectName
}

object CreatePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName, attributes: PlacementAttributeMap = null): CreatePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName, projectName = projectName)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[CreatePlacementRequest]
  }
}

