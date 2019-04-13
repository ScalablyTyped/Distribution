package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportInstanceTaskDetails extends js.Object {
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The instance operating system.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
  /**
    * One or more volumes.
    */
  var Volumes: js.UndefOr[ImportInstanceVolumeDetailSet] = js.undefined
}

object ImportInstanceTaskDetails {
  @scala.inline
  def apply(
    Description: String = null,
    InstanceId: String = null,
    Platform: PlatformValues = null,
    Volumes: ImportInstanceVolumeDetailSet = null
  ): ImportInstanceTaskDetails = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes)
    __obj.asInstanceOf[ImportInstanceTaskDetails]
  }
}

