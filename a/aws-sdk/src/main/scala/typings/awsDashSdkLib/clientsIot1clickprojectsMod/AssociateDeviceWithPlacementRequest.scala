package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateDeviceWithPlacementRequest extends js.Object {
  /**
    * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4 character prefix is required for all deviceId values.
    */
  var deviceId: DeviceId
  /**
    * The device template name to associate with the device ID.
    */
  var deviceTemplateName: DeviceTemplateName
  /**
    * The name of the placement in which to associate the device.
    */
  var placementName: PlacementName
  /**
    * The name of the project containing the placement in which to associate the device.
    */
  var projectName: ProjectName
}

object AssociateDeviceWithPlacementRequest {
  @scala.inline
  def apply(
    deviceId: DeviceId,
    deviceTemplateName: DeviceTemplateName,
    placementName: PlacementName,
    projectName: ProjectName
  ): AssociateDeviceWithPlacementRequest = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, deviceTemplateName = deviceTemplateName, placementName = placementName, projectName = projectName)
  
    __obj.asInstanceOf[AssociateDeviceWithPlacementRequest]
  }
}

