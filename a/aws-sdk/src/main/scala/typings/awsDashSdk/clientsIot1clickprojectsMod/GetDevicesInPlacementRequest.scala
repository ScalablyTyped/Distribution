package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicesInPlacementRequest extends js.Object {
  /**
    * The name of the placement to get the devices from.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName = js.native
}

object GetDevicesInPlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): GetDevicesInPlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDevicesInPlacementRequest]
  }
}

