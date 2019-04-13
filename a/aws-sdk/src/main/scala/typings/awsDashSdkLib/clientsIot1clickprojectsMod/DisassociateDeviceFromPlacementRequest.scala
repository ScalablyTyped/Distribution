package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateDeviceFromPlacementRequest extends js.Object {
  /**
    * The device ID that should be removed from the placement.
    */
  var deviceTemplateName: DeviceTemplateName
  /**
    * The name of the placement that the device should be removed from.
    */
  var placementName: PlacementName
  /**
    * The name of the project that contains the placement.
    */
  var projectName: ProjectName
}

object DisassociateDeviceFromPlacementRequest {
  @scala.inline
  def apply(deviceTemplateName: DeviceTemplateName, placementName: PlacementName, projectName: ProjectName): DisassociateDeviceFromPlacementRequest = {
    val __obj = js.Dynamic.literal(deviceTemplateName = deviceTemplateName, placementName = placementName, projectName = projectName)
  
    __obj.asInstanceOf[DisassociateDeviceFromPlacementRequest]
  }
}

