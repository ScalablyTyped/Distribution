package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevicesInPlacementRequest extends js.Object {
  /**
    * The name of the placement to get the devices from.
    */
  var placementName: PlacementName
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName
}

object GetDevicesInPlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): GetDevicesInPlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName, projectName = projectName)
  
    __obj.asInstanceOf[GetDevicesInPlacementRequest]
  }
}

