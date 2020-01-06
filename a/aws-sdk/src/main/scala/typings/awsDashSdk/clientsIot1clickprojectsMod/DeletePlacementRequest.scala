package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePlacementRequest extends js.Object {
  /**
    * The name of the empty placement to delete.
    */
  var placementName: PlacementName = js.native
  /**
    * The project containing the empty placement to delete.
    */
  var projectName: ProjectName = js.native
}

object DeletePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): DeletePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePlacementRequest]
  }
}

