package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePlacementRequest extends js.Object {
  /**
    * The name of the empty placement to delete.
    */
  var placementName: PlacementName
  /**
    * The project containing the empty placement to delete.
    */
  var projectName: ProjectName
}

object DeletePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): DeletePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName, projectName = projectName)
  
    __obj.asInstanceOf[DeletePlacementRequest]
  }
}

